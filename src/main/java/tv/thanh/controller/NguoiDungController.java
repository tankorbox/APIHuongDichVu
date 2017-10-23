package tv.thanh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.NguoiDung;
import tv.thanh.repository.NguoiDungRepository;
import tv.thanh.service.NguoiDungService;

@RestController
@RequestMapping("nguoidung")
public class NguoiDungController {
	@Autowired
	private NguoiDungService nguoiDungService;
	
	@Autowired
	private NguoiDungRepository nguoiDungRepository;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<NguoiDung> getAll(){
		return (List<NguoiDung>) nguoiDungService.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public NguoiDung getById(@PathVariable("id") int id) {
		return nguoiDungService.findById(id);
	}
	
	@RequestMapping(value="/getbyfullname",consumes= {"multipart/form-data"},method=RequestMethod.POST)
	public List<NguoiDung> getByName(@RequestPart String name) {
		List<NguoiDung> nguoiDungs = nguoiDungService.findAll();
		List<NguoiDung> ketqua = new ArrayList<>();
		for (NguoiDung nDung: nguoiDungs) {
			if (nDung.getTendaydu().contains(name)) {
				ketqua.add(nDung);
			}
		}
		return ketqua;
	}
	
	@RequestMapping(value="/getbyusername/{name}",method=RequestMethod.GET)
	public List<NguoiDung> getByUsername(@PathVariable("name") String name) {
		List<NguoiDung> nguoiDungs = nguoiDungService.findAll();
		List<NguoiDung> ketqua = new ArrayList<>();
		for (NguoiDung nDung: nguoiDungs) {
			if (nDung.getTendangnhap().equals(name)) {
				ketqua.add(nDung);
			}
		}
		return ketqua;
	}
	
	@RequestMapping(value="/getbyvaitro/{vaitro}",method=RequestMethod.GET)
	public List<NguoiDung> getByVaitro(@PathVariable("vaitro") int vaitro) {
		List<NguoiDung> nguoiDungs = nguoiDungService.findAll();
		List<NguoiDung> ketqua = new ArrayList<>();
		for (NguoiDung nDung: nguoiDungs) {
			if (nDung.getVaitro().getId_vaitro() == vaitro) {
				ketqua.add(nDung);
			}
		}
		return ketqua;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public NguoiDung addNguoiDung(@RequestBody NguoiDung nguoidung) {
		List<NguoiDung> listND = nguoiDungService.findAll();
		for (NguoiDung nguoiDung2 : listND) {
			if (nguoiDung2.getTendangnhap().equals(nguoidung.getTendangnhap())) {
				return null;
			}
		}
		return nguoiDungRepository.save(nguoidung);
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public NguoiDung updateNguoiDung(@RequestBody NguoiDung nguoidung) {
		return nguoiDungService.update(nguoidung);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public String deleteNguoiDung(@PathVariable("id") int id) {
		NguoiDung nguoiDung = nguoiDungRepository.findOne(id);
		if (nguoiDung==null) {
			return "not found";
		}
		nguoiDungRepository.delete(id);
		return "success";
	}
}
