package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.VaiTro;
import tv.thanh.service.VaiTroService;

@RestController
@RequestMapping("vaitro")
public class VaiTroController {
	@Autowired
	private VaiTroService vaiTroService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<VaiTro> getAll(){
		return (List<VaiTro>) vaiTroService.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public VaiTro getById(@PathVariable("id") int id) {
		return vaiTroService.findById(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.PUT)
	public VaiTro insert(@RequestBody VaiTro vaitro) {
		vaiTroService.insert(vaitro);
		return vaitro;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public VaiTro update(@RequestBody VaiTro vaitro) {
		vaiTroService.update(vaitro);
		return vaitro;
	}
}
