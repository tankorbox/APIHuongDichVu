package tv.thanh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.DienThoai;
import tv.thanh.model.PhuKien;
import tv.thanh.model.SanPham;
import tv.thanh.repository.PhuKienRepository;
import tv.thanh.repository.SanPhamRepository;
import tv.thanh.service.PhuKienService;

@RestController
@RequestMapping("phukien")
public class PhuKienController {
	@Autowired
	private PhuKienService phuKienService;

	@Autowired
	private PhuKienRepository phuKienRepository;
	
	@Autowired
	private SanPhamRepository sanPhamRepository;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<PhuKien> getAll() {
		return (List<PhuKien>) phuKienService.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public PhuKien getById(@PathVariable("id") int id) {
		return phuKienService.findById(id);
	}

	@RequestMapping(value = "/byidsanpham/{id_sanpham}", method = RequestMethod.GET)
	public PhuKien getByIdSanPham(@PathVariable("id_sanpham") int idsp) {
		List<PhuKien> phuKiens = phuKienRepository.findAll();
		PhuKien dt = new PhuKien();
		for (PhuKien p : phuKiens) {
			if (idsp == p.getSanpham().getId()) {
				dt = p;
				break;
			}
		}
		return dt;
	}
	
	@RequestMapping(value="/phukienlienquansanpham/{idsp}")
	public List<PhuKien> getListPhuKienLienQuanDienThoai(@PathVariable("idsp") String idsp){
		List<PhuKien> ketqua = new ArrayList<>();
		List<PhuKien> listPK = phuKienRepository.findAll();
		for (PhuKien phuKien : listPK) {
			String str = phuKien.getDienthoailienquan();
			String [] arrayStr = str.split(",");
			for (String s: arrayStr) {
				if (s.equals(idsp)) {
					ketqua.add(phuKien);
					break;
				}
			}
		}
		
		return ketqua;
	}

	@PostMapping("/add")
	public PhuKien addPhuKien(@RequestBody PhuKien phukien) {
		SanPham sanpham  = sanPhamRepository.save(phukien.getSanpham());
		phukien.setSanpham(sanpham);
		return phuKienRepository.save(phukien);
	}

	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public PhuKien updatePhuKien(@RequestBody PhuKien phukien) {
		sanPhamRepository.save(phukien.getSanpham());
		return phuKienRepository.save(phukien);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") int id) {
		PhuKien phukien = phuKienRepository.findOne(id);
		if (phukien == null) {
			return "not found";
		}
		phuKienRepository.delete(phukien);
		return "success";
	}
}
