package cn.edu.njnu.newssearchserver.pojo;

import lombok.Data;

@Data
public class NewWord {
	String word;
	String explanation;

	public NewWord() {
	}

	public NewWord(NewWordDescription newWord) {
		this.word = newWord.word;
		this.explanation = newWord.explanation;
	}
}
