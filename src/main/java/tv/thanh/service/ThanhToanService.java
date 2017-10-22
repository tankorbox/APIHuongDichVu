package tv.thanh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.thanh.model.ThanhToan;
import tv.thanh.repository.ThanhToanRepository;

@Service
public class ThanhToanService {
	@Autowired
	ThanhToanRepository thanhToanRepository;
	
	public List<ThanhToan> findAll(){
		return thanhToanRepository.findAll();
	}
	
	public ThanhToan findById(int id) {
		return thanhToanRepository.findOne(id);
	}
}
