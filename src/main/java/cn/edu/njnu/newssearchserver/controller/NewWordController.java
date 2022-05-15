package cn.edu.njnu.newssearchserver.controller;

import cn.edu.njnu.newssearchserver.annotation.ResponseResult;
import cn.edu.njnu.newssearchserver.pojo.NewWordGroup;
import cn.edu.njnu.newssearchserver.service.NewWordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("newword")
public class NewWordController {
	@Autowired
	private NewWordService newWordService;

	@ResponseResult
	@RequestMapping(value = "/{year}", method = RequestMethod.GET)
	public List<NewWordGroup> getNewWordsByYear(@PathVariable int year) {
		return newWordService.searchNewWordsByYear(year);
	}
}
