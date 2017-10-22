package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tv.thanh.model.LoaiSanPham;
import tv.thanh.repository.LoaiSanPhamRepository;
import tv.thanh.service.LoaiSanPhamService;

@RestController
@RequestMapping("loaisanpham")
public class LoaiSanPhamController {
	@Autowired
	private LoaiSanPhamService loaiSanPhamService;
	@Autowired
	private LoaiSanPhamRepository loaiSanPhamRepository;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<LoaiSanPham> getAll() {
		return (List<LoaiSanPham>) loaiSanPhamService.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public LoaiSanPham getById(@PathVariable("id") int id) {
		return loaiSanPhamService.findById(id);
	}

	@PostMapping("/add")
	public LoaiSanPham addLoaiSanPham(@RequestBody LoaiSanPham loaisp) {
		return loaiSanPhamRepository.save(loaisp);
	}

	@PostMapping("/update")
	public LoaiSanPham updateLoaiSanPham(@RequestBody LoaiSanPham loaisp) {
		return loaiSanPhamRepository.save(loaisp);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") int id) {
		LoaiSanPham loaisp = loaiSanPhamRepository.findOne(id);
		if (loaisp == null) {
			return "not found";
		}
		loaiSanPhamRepository.delete(loaisp);
		return "success";
	}
}
