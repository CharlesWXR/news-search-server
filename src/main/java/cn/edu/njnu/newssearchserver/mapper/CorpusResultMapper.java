package cn.edu.njnu.newssearchserver.mapper;

import cn.edu.njnu.newssearchserver.pojo.Corpus;
import cn.edu.njnu.newssearchserver.pojo.CorpusResult;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface CorpusResultMapper extends BaseMapper<CorpusResult> {
	List<Corpus> getCorpusByWord(String word);

	List<Corpus> blurQueryByWord(String word);

	List<String> fulltextQuery(String word);
}
