package tv.thanh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.ChiTietDonHang;
import tv.thanh.model.SanPham;
import tv.thanh.repository.SanPhamRepository;
import tv.thanh.service.SanPhamService;

@RestController
@RequestMapping("sanpham")
public class SanPhamController {
	@Autowired
	private SanPhamService sanPhamService;
	
	@Autowired
	private SanPhamRepository sanphamRepository;
	
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
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public SanPham addSanPham(@RequestBody SanPham sanpham) {
		return sanphamRepository.save(sanpham);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public SanPham updateSanPham(@RequestBody SanPham sanpham) {
		return sanphamRepository.save(sanpham);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String deleteSanPham(@PathVariable("id") int id) {
		SanPham ctdh = sanphamRepository.findOne(id);
		if (ctdh==null) return "not found";
		sanphamRepository.delete(id);
		return "success";
	}
}