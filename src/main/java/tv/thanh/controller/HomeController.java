package tv.thanh.controller;

import org.springframework.web.bind.annotation.GetMapping;

import tv.thanh.model.NguoiDung;
import tv.thanh.repository.ThemNguoiDungRepository;

public class HomeController {
	ThemNguoiDungRepository themnguoidung;
	@GetMapping(value = "/")
	public String home() {
		return "hello";
	}
	
	@GetMapping(value = "/private")
	public String privateArea() {
		return "private";
	}
}
