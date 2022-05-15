package cn.edu.njnu.newssearchserver.service;

import cn.edu.njnu.newssearchserver.pojo.NewWordGroup;

import java.util.List;

public interface NewWordService {
	List<NewWordGroup> searchNewWordsByYear(int year);
}
