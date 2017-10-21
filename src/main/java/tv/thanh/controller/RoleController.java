package tv.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.Role;
import tv.thanh.service.RoleService;


@RestController
@RequestMapping("role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Role> getAll(){
		return (List<Role>) roleService.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Role getById(@PathVariable("id") int id) {
		return roleService.findById(id);
	}
}
