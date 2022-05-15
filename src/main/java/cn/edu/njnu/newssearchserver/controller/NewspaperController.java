package cn.edu.njnu.newssearchserver.controller;

import cn.edu.njnu.newssearchserver.annotation.ResponseResult;
import cn.edu.njnu.newssearchserver.pojo.Newspaper;
import cn.edu.njnu.newssearchserver.service.NewspaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/newspaper")
public class NewspaperController {
	@Autowired
	private NewspaperService newspaperService;

	@ResponseResult
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Map<String, Object> initLoading() {
		return newspaperService.initLoading();
	}

	@ResponseResult
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public Newspaper getNewspaperByName(@PathVariable String name) {
		return newspaperService.getNewspaperByName(name);
	}
}
