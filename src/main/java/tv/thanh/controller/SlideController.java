package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.Slide;
import tv.thanh.service.SlideService;

@RestController
@RequestMapping("slide")
public class SlideController {
	@Autowired
	private SlideService slideService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Slide> getAll(){
		return (List<Slide>) slideService.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Slide getById(@PathVariable("id") int id) {
		return slideService.findById(id);
	}
}

