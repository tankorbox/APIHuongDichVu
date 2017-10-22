package tv.thanh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.DonHang;
import tv.thanh.repository.DonHangRepository;
import tv.thanh.service.DonHangService;

@RestController
@RequestMapping("donhang")
public class DonHangController {
	@Autowired
	private DonHangService donHangService;
	
	@Autowired
	private DonHangRepository donHangRepository;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<DonHang> getAll(){
		return (List<DonHang>) donHangService.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public DonHang getById(@PathVariable("id") int id) {
		return donHangService.findById(id);
	}
	
	@RequestMapping(value="/getbykhachhangid/{id}", method=RequestMethod.GET)
	public List<DonHang> getDonHangByKhachHangId(@PathVariable("id") int id) {
		List<DonHang> donHangs = donHangService.findAll();	
		List<DonHang> ketqua = new ArrayList<>();
		for (DonHang donHang : donHangs) {
			if (donHang.getNguoidung().getId()==id) ketqua.add(donHang);
		}
		return ketqua;
	}
	
	@RequestMapping(value="/getbytrangthai/{trangthai}", method=RequestMethod.GET)
	public List<DonHang> getDonHangByTinhTrang(@PathVariable("trangthai") int trangthai) {
		List<DonHang> donHangs = donHangService.findAll();	
		List<DonHang> ketqua = new ArrayList<>();
		for (DonHang donHang : donHangs) {
			if (donHang.getTrangthai()==trangthai) ketqua.add(donHang);
		}
		return ketqua;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public DonHang addDonHang(@RequestBody DonHang donhang) {
		return donHangRepository.save(donhang);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public DonHang updateDonHang(@RequestBody DonHang donhang) {
		return donHangRepository.save(donhang);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String deleteDonHang(@PathVariable("id") int id) {
		DonHang dh = donHangRepository.findOne(id);
		if (dh==null) return "not found";
		donHangRepository.delete(id);
		return "success";
	}
}
