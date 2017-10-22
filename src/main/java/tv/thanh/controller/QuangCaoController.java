package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.QuangCao;
import tv.thanh.service.QuangCaoService;

@RestController
@RequestMapping("quangcao")
public class QuangCaoController {
	@Autowired
	private QuangCaoService quangCaoService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<QuangCao> getAll(){
		return (List<QuangCao>) quangCaoService.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public QuangCao getById(@PathVariable("id") int id) {
		return quangCaoService.findById(id);
	}
}

