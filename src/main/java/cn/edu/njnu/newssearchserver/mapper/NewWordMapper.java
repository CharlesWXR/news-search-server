package cn.edu.njnu.newssearchserver.mapper;

import cn.edu.njnu.newssearchserver.pojo.NewWordDescription;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface NewWordMapper extends BaseMapper<NewWordDescription> {
	List<NewWordDescription> searchAllByYear(int year);
}
