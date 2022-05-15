package cn.edu.njnu.newssearchserver.pojo;

import cn.edu.njnu.newssearchserver.enums.ResultCode;
import lombok.Data;

@Data
public class Result {
	private int code;
	private String message;
	private Object result;

	public Result(ResultCode resultCode, Object result) {
		this.code = resultCode.getCode();
		this.message = resultCode.getMessage();
		this.result = result;
	}
}
