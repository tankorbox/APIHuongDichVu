package tv.thanh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.thanh.model.NguoiDung;
import tv.thanh.repository.NguoiDungRepository;

@Service
public class NguoiDungService {
	@Autowired
	NguoiDungRepository nguoiDungRepository;
	
	public List<NguoiDung> findAll(){
		return nguoiDungRepository.findAll();
	}
	
	public NguoiDung findById(int id) {
		return nguoiDungRepository.findOne(id);
	}

	public void insert(NguoiDung nguoidung) {
		nguoiDungRepository.save(nguoidung);
	}

	public NguoiDung update(NguoiDung nguoidung) {
		return nguoiDungRepository.save(nguoidung);
	}

	
	
}
