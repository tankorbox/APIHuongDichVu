package tv.thanh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.thanh.model.Slide;
import tv.thanh.repository.SlideRepository;

@Service
public class SlideService {
	@Autowired
	SlideRepository slideRepository;
	
	public List<Slide> findAll(){
		return slideRepository.findAll();
	}
	
	public Slide findById(int id) {
		return slideRepository.findOne(id);
	}
}
