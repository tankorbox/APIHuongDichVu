package tv.thanh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.thanh.model.DonHang;
import tv.thanh.model.PhuKien;
import tv.thanh.repository.DonHangRepository;
import tv.thanh.repository.PhuKienRepository;

@Service
public class PhuKienService {
	@Autowired
	PhuKienRepository phuKienRepository;
	
	public List<PhuKien> findAll(){
		return phuKienRepository.findAll();
	}
	
	public PhuKien findById(int id) {
		return phuKienRepository.findOne(id);
	}
}
