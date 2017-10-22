package tv.thanh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.thanh.model.DienThoai;
import tv.thanh.model.PhuKien;
import tv.thanh.repository.DienThoaiRepository;
import tv.thanh.repository.PhuKienRepository;

@Service
public class DienThoaiService {
	@Autowired
	DienThoaiRepository dienThoaiRepository;

	public List<DienThoai> findAll() {
		return dienThoaiRepository.findAll();
	}

	public DienThoai findById(int id) {
		return dienThoaiRepository.findOne(id);
	}
}
