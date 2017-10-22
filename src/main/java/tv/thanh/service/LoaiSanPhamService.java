package tv.thanh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.thanh.model.DonHang;
import tv.thanh.model.LoaiSanPham;
import tv.thanh.repository.DonHangRepository;
import tv.thanh.repository.LoaiSanPhamRepository;

@Service
public class LoaiSanPhamService {
	@Autowired
	LoaiSanPhamRepository loaiSanPhamRepository;
	
	public List<LoaiSanPham> findAll(){
		return loaiSanPhamRepository.findAll();
	}
	
	public LoaiSanPham findById(int id) {
		return loaiSanPhamRepository.findOne(id);
	}
}
