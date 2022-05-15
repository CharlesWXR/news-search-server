package cn.edu.njnu.newssearchserver.controller;

import cn.edu.njnu.newssearchserver.enums.ResultCode;
import cn.edu.njnu.newssearchserver.exception.BizException;
import cn.edu.njnu.newssearchserver.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = {BindException.class, MethodArgumentNotValidException.class, MissingServletRequestParameterException.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Result bindExceptionHandler(Exception e) {
		return new Result(ResultCode.BAD_REQUEST, null);
	}

	@ExceptionHandler(value = BizException.class)
	@ResponseStatus(HttpStatus.OK)
	public Result handleBizException(BizException e) {
		log.warn(e.getMessage());
		return e.getResult();
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public Result handleException(Exception e) {
		log.error(e.getMessage(), e.getStackTrace());
		return new Result(ResultCode.InternalServerError, null);
	}
}
