package tv.thanh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tv.thanh.model.LoaiSanPham;
import tv.thanh.model.VaiTro;
import tv.thanh.repository.LoaiSanPhamRepository;
import tv.thanh.repository.VaiTroRepository;

@Service
public class VaiTroService {
	@Autowired
	VaiTroRepository vaiTroRepository;
	
	public List<VaiTro> findAll(){
		return vaiTroRepository.findAll();
	}
	
	public VaiTro findById(int id) {
		return vaiTroRepository.findOne(id);
	}
	
	public String insert(VaiTro vaitro) {
		vaiTroRepository.save(vaitro);
		return "ok";
	}
	public String update(VaiTro vaitro) {
		//TODO
		return "ok";
	}
}
