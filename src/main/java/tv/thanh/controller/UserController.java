package tv.thanh.controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tv.thanh.model.User;
import tv.thanh.repository.UserRepository;
import tv.thanh.service.UserService;
import tv.thanh.specification.UserSpecificationBuilder;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> getAll() {
		return userService.findAll();
	}

	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public User getById(@PathVariable("id") int id) {
		return userService.findById(id);
	}
	@Autowired
	private UserRepository repo;

	@RequestMapping(method = RequestMethod.GET, value = "/users")
	@ResponseBody
	public List<User> search(@RequestParam(value = "search") String search) {
		UserSpecificationBuilder builder = new UserSpecificationBuilder();
		Pattern pattern = Pattern.compile("(\\w+?)(:|<|>)(\\w+?),");
		Matcher matcher = pattern.matcher(search + ",");
		while (matcher.find()) {
			builder.with(matcher.group(1), matcher.group(2), matcher.group(3));
		}
		Specification<User> spec = builder.build();
		return repo.findAll(spec);
	}
}
