package cn.edu.njnu.newssearchserver.service.impl;

import cn.edu.njnu.newssearchserver.mapper.PassageLinkMapper;
import cn.edu.njnu.newssearchserver.pojo.PassageLink;
import cn.edu.njnu.newssearchserver.service.PassageLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassageLinkServiceImpl implements PassageLinkService {
	@Autowired
	private PassageLinkMapper passageLinkMapper;

	@Override
	public List<PassageLink> getAll() {
		return passageLinkMapper.selectList(null);
	}
}
