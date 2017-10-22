package tv.thanh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.thanh.model.SanPham;
import tv.thanh.repository.SanPhamRepository;

@Service
public class SanPhamService {
	@Autowired
	SanPhamRepository sanPhamRepository;
	
	public List<SanPham> findAll(){
		return sanPhamRepository.findAll();
	}
	
	public SanPham findById(int id) {
		return sanPhamRepository.findOne(id);
	}
}
