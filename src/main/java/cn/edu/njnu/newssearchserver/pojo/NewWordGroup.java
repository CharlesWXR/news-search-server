package cn.edu.njnu.newssearchserver.pojo;

import lombok.Data;

import java.util.List;

@Data
public class NewWordGroup {
	String title;
	List<NewWord> words;
}
