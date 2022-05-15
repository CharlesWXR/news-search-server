package cn.edu.njnu.newssearchserver.enums;

public enum ResultCode {
	SUCCESS(200, "Success"),
	BAD_REQUEST(400, "Bad Request"),
	UNAUTHORIZED(401, "Unauthorized access"),
	InternalServerError(500, "Internal server error");

	private int code;
	private String message;

	ResultCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
