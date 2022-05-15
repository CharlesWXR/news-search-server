package cn.edu.njnu.newssearchserver.service;

import cn.edu.njnu.newssearchserver.pojo.Corpus;

import java.util.List;
import java.util.Map;

public interface CorpusService {
	List<Corpus> getCorpusByWord(String word);

	Map<String, List<Corpus>> blurQueryByWord(String word);

	List<String> getFulltextByWord(String word);
}
