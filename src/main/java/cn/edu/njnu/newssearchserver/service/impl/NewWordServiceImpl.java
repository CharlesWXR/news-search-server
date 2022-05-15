package cn.edu.njnu.newssearchserver.service.impl;

import cn.edu.njnu.newssearchserver.mapper.NewWordMapper;
import cn.edu.njnu.newssearchserver.pojo.NewWord;
import cn.edu.njnu.newssearchserver.pojo.NewWordDescription;
import cn.edu.njnu.newssearchserver.pojo.NewWordGroup;
import cn.edu.njnu.newssearchserver.service.NewWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NewWordServiceImpl implements NewWordService {
	@Autowired
	private NewWordMapper newWordMapper;

	@Override
	public List<NewWordGroup> searchNewWordsByYear(int year) {
		List<NewWordDescription> words = newWordMapper.searchAllByYear(year);
		Map<String, List<NewWord>> groupedWords = new HashMap<String, List<NewWord>>();

		for (NewWordDescription word : words) {
			if (!groupedWords.containsKey(word.getTitle()))
				groupedWords.put(word.getTitle(), new ArrayList<NewWord>());
			groupedWords.get(word.getTitle()).add(new NewWord(word));
		}

		List<NewWordGroup> res = new ArrayList<NewWordGroup>();
		groupedWords.forEach((key, value) -> {
			NewWordGroup group = new NewWordGroup();
			group.setTitle(key);
			group.setWords(value);
			res.add(group);
		});

		return res;
	}
}
