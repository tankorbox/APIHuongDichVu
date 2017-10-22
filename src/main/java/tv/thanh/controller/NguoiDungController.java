package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.NguoiDung;
import tv.thanh.service.NguoiDungService;

@RestController
@RequestMapping("nguoidung")
public class NguoiDungController {
	@Autowired
	private NguoiDungService nguoiDungService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<NguoiDung> getAll(){
		return (List<NguoiDung>) nguoiDungService.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public NguoiDung getById(@PathVariable("id") int id) {
		return nguoiDungService.findById(id);
	}

}
