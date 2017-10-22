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

import tv.thanh.model.QuangCao;
import tv.thanh.repository.QuangCaoRepository;
import tv.thanh.service.QuangCaoService;

@RestController
@RequestMapping("quangcao")
public class QuangCaoController {
	@Autowired
	private QuangCaoService quangCaoService;

	@Autowired
	private QuangCaoRepository quangCaoRepository;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<QuangCao> getAll() {
		return (List<QuangCao>) quangCaoService.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public QuangCao getById(@PathVariable("id") int id) {
		return quangCaoService.findById(id);
	}

	@PostMapping("/add")
	public QuangCao addQuangCao(@RequestBody QuangCao quangcao) {
		return quangCaoRepository.save(quangcao);
	}

	@PostMapping("/update")
	public QuangCao updateQuangCao(@RequestBody QuangCao quangcao) {
		return quangCaoRepository.save(quangcao);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") int id) {
		QuangCao quangcao = quangCaoRepository.findOne(id);
		if (quangcao == null) {
			return "not found";
		}
		quangCaoRepository.delete(quangcao);
		return "success";
	}
}
