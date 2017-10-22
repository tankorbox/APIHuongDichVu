package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tv.thanh.model.PhuKien;
import tv.thanh.repository.PhuKienRepository;
import tv.thanh.service.PhuKienService;

@RestController
@RequestMapping("phukien")
public class PhuKienController {
	@Autowired
	private PhuKienService phuKienService;

	@Autowired
	private PhuKienRepository phuKienRepository;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<PhuKien> getAll() {
		return (List<PhuKien>) phuKienService.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public PhuKien getById(@PathVariable("id") int id) {
		return phuKienService.findById(id);
	}

	@RequestMapping(value = "/byidsanpham/{id_sanpham}", method = RequestMethod.GET)
	public PhuKien getByIdPhuKien(@PathVariable("id_sanpham") int idsp) {
		List<PhuKien> phuKiens = phuKienService.findAll();
		PhuKien pk = new PhuKien();
		for (PhuKien d : phuKiens) {
			if (idsp == d.getSanpham().getId()) {
				pk = d;
				break;
			}
		}
		return pk;
	}

	@PostMapping("/add")
	public PhuKien addPhuKien(@RequestBody PhuKien phukien) {
		return phuKienRepository.save(phukien);
	}

	@PostMapping("/update")
	public PhuKien updatePhuKien(@RequestBody PhuKien phukien) {
		return phuKienRepository.save(phukien);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") int id) {
		PhuKien phukien = phuKienRepository.findOne(id);
		if (phukien == null) {
			return "not found";
		}
		phuKienRepository.delete(phukien);
		return "success";
	}
}
