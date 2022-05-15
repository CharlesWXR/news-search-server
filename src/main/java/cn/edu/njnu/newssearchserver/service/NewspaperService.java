package cn.edu.njnu.newssearchserver.service;

import cn.edu.njnu.newssearchserver.pojo.Newspaper;

import java.util.Map;

public interface NewspaperService {
	Map<String, Object> initLoading();

	Newspaper getNewspaperByName(String name);
}
