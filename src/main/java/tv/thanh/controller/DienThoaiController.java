package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.DienThoai;
import tv.thanh.repository.DienThoaiRepository;
import tv.thanh.service.DienThoaiService;

@RestController
@RequestMapping("dienthoai")
public class DienThoaiController {

	@Autowired
	private DienThoaiService dienThoaiService;

	@Autowired
	private DienThoaiRepository dienThoaiRepository;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<DienThoai> getAll() {
		return (List<DienThoai>) dienThoaiService.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public DienThoai getById(@PathVariable("id") int id) {
		return dienThoaiService.findById(id);
	}

	@RequestMapping(value = "/byidsanpham/{id_sanpham}", method = RequestMethod.GET)
	public DienThoai getByIdSanPham(@PathVariable("id_sanpham") int idsp) {
		List<DienThoai> dienthoais = dienThoaiService.findAll();
		DienThoai dt = new DienThoai();
		for (DienThoai d : dienthoais) {
			if (idsp == d.getSanpham().getId()) {
				dt = d;
				break;
			}
		}
		return dt;
	}

	@PostMapping("/add")
	public DienThoai addDienThoai(@RequestBody DienThoai dienthoai) {
		return dienThoaiRepository.save(dienthoai);
	}

	@PostMapping("/update")
	public ResponseEntity<DienThoai> updateDienThoaiById(@RequestBody DienThoai dienthoai) {
		DienThoai dt = dienThoaiRepository.save(dienthoai);
		return ResponseEntity.ok(dt);

	}

	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") int id) {
		DienThoai dienthoai = dienThoaiRepository.findOne(id);
		if (dienthoai == null) {
			return "not found";
		}
		dienThoaiRepository.delete(dienthoai);
		return "success";
	}
}
