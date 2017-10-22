package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.PhuKien;
import tv.thanh.service.PhuKienService;

@RestController
@RequestMapping("phukien")
public class PhuKienController {
	@Autowired
	private PhuKienService phuKienService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<PhuKien> getAll() {
		return (List<PhuKien>) phuKienService.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public PhuKien getById(@PathVariable("id") int id) {
		return phuKienService.findById(id);
	}
}
