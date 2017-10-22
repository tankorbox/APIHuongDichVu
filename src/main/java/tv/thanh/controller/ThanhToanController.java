package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.ThanhToan;
import tv.thanh.service.ThanhToanService;

@RestController
@RequestMapping("thanhtoan")
public class ThanhToanController {
	@Autowired
	private ThanhToanService thanhToanService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<ThanhToan> getAll(){
		return (List<ThanhToan>) thanhToanService.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ThanhToan getById(@PathVariable("id") int id) {
		return thanhToanService.findById(id);
	}
}
