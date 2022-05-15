package cn.edu.njnu.newssearchserver.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("corpus")
public class CorpusResult {
	@TableId(type = IdType.AUTO)
	private int id;

	private String word;
	private String description;
	private String sample;
	private String imgsrc;
	private int fulltext_id;
}
