package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.DienThoai;
import tv.thanh.service.DienThoaiService;

@RestController
@RequestMapping("dienthoai")
public class DienThoaiController {
	@Autowired
	private DienThoaiService dienThoaiService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<DienThoai> getAll() {
		return (List<DienThoai>) dienThoaiService.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public DienThoai getById(@PathVariable("id") int id) {
		return dienThoaiService.findById(id);
	}
}
