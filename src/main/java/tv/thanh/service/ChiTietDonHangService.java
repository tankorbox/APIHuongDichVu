package tv.thanh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.thanh.model.ChiTietDonHang;
import tv.thanh.repository.ChiTietDonHangRepository;

@Service

public class ChiTietDonHangService {
	@Autowired
	ChiTietDonHangRepository chiTietDonHangRepository;
	public List<ChiTietDonHang> findAll() {
		return chiTietDonHangRepository.findAll();
	}
	public ChiTietDonHang findById(int id) {
		System.out.println(id+" get one");
		return chiTietDonHangRepository.findOne(id);
	}
}
