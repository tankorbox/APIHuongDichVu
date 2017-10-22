package tv.thanh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.SanPham;
import tv.thanh.service.SanPhamService;

@RestController
@RequestMapping("sanpham")
public class SanPhamController {
	@Autowired
	private SanPhamService sanPhamService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<SanPham> getAll(){
		return (List<SanPham>) sanPhamService.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public SanPham getById(@PathVariable("id") int id) {
		return sanPhamService.findById(id);
	}
	
	@RequestMapping(value="/theotensp/{name}", method=RequestMethod.GET)
	public List<SanPham> getByTenSanPham(@PathVariable("name") String name) {
		List<SanPham> sanphams = sanPhamService.findAll();	
		List<SanPham> ketqua = new ArrayList<>();
		for (SanPham sanPham : sanphams) {
			if (sanPham.getTensanpham().toLowerCase().contains(name.toLowerCase())) ketqua.add(sanPham);
		}
		return ketqua;
	}
}
