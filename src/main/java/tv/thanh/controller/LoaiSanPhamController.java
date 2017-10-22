package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.LoaiSanPham;
import tv.thanh.service.LoaiSanPhamService;

@RestController
@RequestMapping("loaisanpham")
public class LoaiSanPhamController {
	@Autowired
	private LoaiSanPhamService loaiSanPhamService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<LoaiSanPham> getAll(){
		return (List<LoaiSanPham>) loaiSanPhamService.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public LoaiSanPham getById(@PathVariable("id") int id) {
		return loaiSanPhamService.findById(id);
	}
}
