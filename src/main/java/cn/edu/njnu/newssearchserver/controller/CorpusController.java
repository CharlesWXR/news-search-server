package cn.edu.njnu.newssearchserver.controller;

import cn.edu.njnu.newssearchserver.annotation.ResponseResult;
import cn.edu.njnu.newssearchserver.pojo.Corpus;
import cn.edu.njnu.newssearchserver.service.CorpusService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/corpus")
public class CorpusController {
	@Autowired
	CorpusService corpusService;

	@ResponseResult
	@RequestMapping(value = "/{word}", method = RequestMethod.GET)
	public List<Corpus> queryCorpusByWord(@PathVariable("word")String word) {
		return corpusService.getCorpusByWord(word);
	}

	@ResponseResult
	@RequestMapping(value = "/blur/{word}", method = RequestMethod.GET)
	public Map<String, List<Corpus>> blurQueryByWord(@PathVariable String word) {
		return corpusService.blurQueryByWord(word);
	}

	@ResponseResult
	@RequestMapping(value = "/fulltext/{word}", method = RequestMethod.GET)
	public List<String> queryFullText(@PathVariable String word) {
		return corpusService.getFulltextByWord(word);
	}
}
