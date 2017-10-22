package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.DonHang;
import tv.thanh.service.DonHangService;

@RestController
@RequestMapping("donhang")
public class DonHangController {
	@Autowired
	private DonHangService donHangService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<DonHang> getAll(){
		return (List<DonHang>) donHangService.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public DonHang getById(@PathVariable("id") int id) {
		return donHangService.findById(id);
	}
}
