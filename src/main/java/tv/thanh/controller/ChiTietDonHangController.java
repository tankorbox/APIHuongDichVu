package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import tv.thanh.model.ChiTietDonHang;
import tv.thanh.service.ChiTietDonHangService;

@RestController
@RequestMapping("chitietdonhang")
public class ChiTietDonHangController {
	@Autowired
	private ChiTietDonHangService chiTietDonHangService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<ChiTietDonHang> getAll(){
		return (List<ChiTietDonHang>) chiTietDonHangService.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ChiTietDonHang getById(@PathVariable("id") int id) {
		return chiTietDonHangService.findById(id);
	}
	
}