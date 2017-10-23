package tv.thanh.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.LoaiSanPham;
import tv.thanh.model.SanPham;
import tv.thanh.repository.LoaiSanPhamRepository;
import tv.thanh.repository.SanPhamRepository;
import tv.thanh.service.SanPhamService;

@RestController
@RequestMapping("sanpham")
public class SanPhamController {
	@Autowired
	private SanPhamService sanPhamService;

	@Autowired
	private LoaiSanPhamRepository loaiSanPhamRepository;

	@Autowired
	private SanPhamRepository sanphamRepository;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<SanPham> getAll() {
		return (List<SanPham>) sanPhamService.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public SanPham getById(@PathVariable("id") int id) {
		return sanPhamService.findById(id);
	}

	@RequestMapping(value = "/getbyloaisanpham/{id_loai}", method = RequestMethod.GET)
	public List<SanPham> getByLoaiSanPham(@PathVariable("id_loai") int id_loai) {
		List<SanPham> ketqua = new ArrayList<>();
		List<SanPham> listSP = sanphamRepository.findAll();
		LoaiSanPham loaiSP = loaiSanPhamRepository.findOne(id_loai);
		if (loaiSP.getId_cha() == 0) {
			for (SanPham sanPham : listSP) {
				if (sanPham.getLoaiSanPham().getId_cha() == id_loai) {
					ketqua.add(sanPham);
				}
			}
		} else {
			for (SanPham sanPham : listSP) {
				if (sanPham.getLoaiSanPham().getId_loaisanpham() == id_loai) {
					ketqua.add(sanPham);
				}
			}
		}
		return ketqua;
	}

	@RequestMapping(value = "/getbytype/{type}",method=RequestMethod.GET)
	public List<SanPham> getSanPhamDienThoai(@PathVariable("type") int type) {
		List<SanPham> ketqua = new ArrayList<>();
		List<SanPham> listSP = sanphamRepository.findAll();
		for (SanPham sanPham : listSP) {
			if (sanPham.getType()==type) ketqua.add(sanPham);
		}
		return ketqua;
	}
	

	@RequestMapping(value = "/theotensp/{name}", method = RequestMethod.GET)
	public List<SanPham> getByTenSanPham(@PathVariable("name") String name) {
		List<SanPham> sanphams = sanPhamService.findAll();
		List<SanPham> ketqua = new ArrayList<>();
		for (SanPham sanPham : sanphams) {
			if (sanPham.getTensanpham().toLowerCase().contains(name.toLowerCase()))
				ketqua.add(sanPham);
		}
		return ketqua;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public SanPham addSanPham(@RequestBody SanPham sanpham) {
		return sanphamRepository.save(sanpham);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public SanPham updateSanPham(@RequestBody SanPham sanpham) {
		return sanphamRepository.save(sanpham);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteSanPham(@PathVariable("id") int id) {
		SanPham ctdh = sanphamRepository.findOne(id);
		if (ctdh == null)
			return "not found";
		sanphamRepository.delete(id);
		return "success";
	}
}