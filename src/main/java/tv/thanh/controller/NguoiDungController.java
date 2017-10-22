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
import tv.thanh.service.NguoiDungService;

@RestController
@RequestMapping("nguoidung")
public class NguoiDungController {
	@Autowired
	private NguoiDungService nguoiDungService;
	
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
	
	@RequestMapping(value="/themnguoidung",method=RequestMethod.POST)
	public NguoiDung addNguoiDung(@RequestBody NguoiDung nguoidung) {
		System.out.println(nguoidung.getTendangnhap());
		return null;
	}
}
