package cn.edu.njnu.newssearchserver.service.impl;

import cn.edu.njnu.newssearchserver.annotation.ResponseResult;
import cn.edu.njnu.newssearchserver.mapper.CorpusResultMapper;
import cn.edu.njnu.newssearchserver.pojo.Corpus;
import cn.edu.njnu.newssearchserver.service.CorpusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CorpusServiceImpl implements CorpusService {
	@Autowired
	private CorpusResultMapper corpusResultMapper;

	@Override
	public List<Corpus> getCorpusByWord(String word) {
		return corpusResultMapper.getCorpusByWord(word);
	}

	@Override
	public Map<String, List<Corpus>> blurQueryByWord(String word) {
		Map<String, List<Corpus>> result = new HashMap<String, List<Corpus>>();

		List<Corpus> corpusList = corpusResultMapper.blurQueryByWord(word);
		for (Corpus corpus : corpusList) {
			if (!result.containsKey(corpus.getCorpus().getWord()))
				result.put(corpus.getCorpus().getWord(), new ArrayList<Corpus>());
			result.get(corpus.getCorpus().getWord()).add(corpus);
		}

		return result;
	}

	@Override
	public List<String> getFulltextByWord(String word) {
		return corpusResultMapper.fulltextQuery(word);
	}
}
