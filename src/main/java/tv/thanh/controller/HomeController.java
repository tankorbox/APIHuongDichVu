package tv.thanh.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

	@GetMapping(value = "/")
	public String home() {
		return "hello";
	}
	
	@GetMapping(value = "/private")
	public String privateArea() {
		return "private";
	}
}
