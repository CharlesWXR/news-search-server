package cn.edu.njnu.newssearchserver.controller;

import cn.edu.njnu.newssearchserver.annotation.ResponseResult;
import cn.edu.njnu.newssearchserver.pojo.PassageLink;
import cn.edu.njnu.newssearchserver.service.PassageLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cantonese")
public class CantoneseController {
	@Autowired
	PassageLinkService passageLinkService;

	@ResponseResult
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<PassageLink> getAll() {
		return passageLinkService.getAll();
	}
}
