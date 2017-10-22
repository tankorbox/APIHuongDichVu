package tv.thanh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.thanh.model.DonHang;
import tv.thanh.repository.DonHangRepository;

@Service
public class DonHangService {
	@Autowired
	DonHangRepository donHangRepository;
	
	public List<DonHang> findAll(){
		return donHangRepository.findAll();
	}
	
	public DonHang findById(int id) {
		return donHangRepository.findOne(id);
	}
}
