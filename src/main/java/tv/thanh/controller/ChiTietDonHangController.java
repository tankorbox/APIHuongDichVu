package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import tv.thanh.model.ChiTietDonHang;
import tv.thanh.model.DonHang;
import tv.thanh.repository.ChiTietDonHangRepository;
import tv.thanh.service.ChiTietDonHangService;

@RestController
@RequestMapping("chitietdonhang")
public class ChiTietDonHangController {
	@Autowired
	private ChiTietDonHangService chiTietDonHangService;
	
	@Autowired
	private ChiTietDonHangRepository chitietdonhangRepository;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<ChiTietDonHang> getAll(){
		return (List<ChiTietDonHang>) chiTietDonHangService.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ChiTietDonHang getById(@PathVariable("id") int id) {
		return chiTietDonHangService.findById(id);
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ChiTietDonHang addChiTietDonHang(@RequestBody ChiTietDonHang donhang) {
		return chitietdonhangRepository.save(donhang);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public ChiTietDonHang updateChiTietDonHang(@RequestBody ChiTietDonHang chiTietDonHang) {
		return chitietdonhangRepository.save(chiTietDonHang);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String deleteChiTietDonHang(@PathVariable("id") int id) {
		ChiTietDonHang ctdh = chitietdonhangRepository.findOne(id);
		if (ctdh==null) return "not found";
		chitietdonhangRepository.delete(id);
		return "success";
	}
}