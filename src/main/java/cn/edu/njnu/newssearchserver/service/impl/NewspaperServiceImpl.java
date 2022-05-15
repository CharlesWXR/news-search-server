package cn.edu.njnu.newssearchserver.service.impl;

import cn.edu.njnu.newssearchserver.mapper.NewspaperMapper;
import cn.edu.njnu.newssearchserver.pojo.Newspaper;
import cn.edu.njnu.newssearchserver.service.NewspaperService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class NewspaperServiceImpl implements NewspaperService {
	@Autowired
	private NewspaperMapper newspaperMapper;

	@Override
	public Map<String, Object> initLoading() {
		Map<String, Object> res = new HashMap<String, Object>();

		QueryWrapper<Newspaper> queryWrapper = new QueryWrapper<Newspaper>();
		queryWrapper.select("name");
		List<Newspaper> newspapers = newspaperMapper.selectList(queryWrapper);
		List<String> names = newspapers.stream().map(t -> t.getName()).collect(Collectors.toList());
		res.put("names", names);

		if (!names.isEmpty()) {
			QueryWrapper<Newspaper> firstNewspaperWrapper = new QueryWrapper<Newspaper>();
			firstNewspaperWrapper.eq("name", names.get(0));
			Newspaper first = newspaperMapper.selectOne(firstNewspaperWrapper);
			res.put("first", first);
		}
		else {
			res.put("first", null);
		}
		return res;
	}

	@Override
	public Newspaper getNewspaperByName(String name) {
		QueryWrapper<Newspaper> queryWrapper = new QueryWrapper<Newspaper>();
		queryWrapper.eq("name", name);
		return newspaperMapper.selectOne(queryWrapper);
	}
}
