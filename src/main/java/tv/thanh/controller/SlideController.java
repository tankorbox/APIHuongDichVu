package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tv.thanh.model.Slide;
import tv.thanh.repository.SlideRepository;
import tv.thanh.service.SlideService;

@RestController
@RequestMapping("slide")
public class SlideController {
	@Autowired
	private SlideService slideService;

	@Autowired
	private SlideRepository slideRepository;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Slide> getAll() {
		return (List<Slide>) slideService.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Slide getById(@PathVariable("id") int id) {
		return slideService.findById(id);
	}

	@PostMapping("/add")
	public Slide addSlide(@RequestBody Slide slide) {
		return slideRepository.save(slide);
	}

	@PostMapping("/update")
	public Slide updateSlide(@RequestBody Slide slide) {
		return slideRepository.save(slide);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") int id) {
		Slide slide = slideRepository.findOne(id);
		if (slide == null) {
			return "not found";
		}
		slideRepository.delete(slide);
		return "success";
	}
}
