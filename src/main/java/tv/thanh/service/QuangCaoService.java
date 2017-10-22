package tv.thanh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.thanh.model.QuangCao;
import tv.thanh.repository.QuangCaoRepository;

@Service
public class QuangCaoService {
	@Autowired
	QuangCaoRepository quangCaoRepository;
	
	public List<QuangCao> findAll(){
		return quangCaoRepository.findAll();
	}
	
	public QuangCao findById(int id) {
		return quangCaoRepository.findOne(id);
	}
}
