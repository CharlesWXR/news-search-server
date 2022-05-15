package cn.edu.njnu.newssearchserver.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("cantonese")
public class PassageLink {
	@TableId
	int id;
	String title;
	String href;
}
