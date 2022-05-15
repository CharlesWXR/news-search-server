package cn.edu.njnu.newssearchserver.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("newspaper")
public class Newspaper {
	int id;
	String name;
	String description;
	String time;
	String location;
	double posx;
	double posy;
	String href;
	String imgsrc;
}
