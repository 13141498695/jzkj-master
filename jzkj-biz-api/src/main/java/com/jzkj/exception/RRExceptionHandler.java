package com.jzkj.exception;

import com.jzkj.common.exception.ResultException;
import com.jzkj.common.utils.ReturnResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理器
 */
@RestControllerAdvice
public class RRExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 处理自定义异常
	 */
	@ExceptionHandler(ResultException.class)
	public ReturnResult handleRRException(ResultException e){
		ReturnResult returnResult = new ReturnResult();
		returnResult.put("code", e.getCode());
		returnResult.put("msg", e.getMessage());

		return returnResult;
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public ReturnResult handleDuplicateKeyException(DuplicateKeyException e){
		logger.error(e.getMessage(), e);
		return ReturnResult.error("数据库中已存在该记录");
	}

	@ExceptionHandler(Exception.class)
	public ReturnResult handleException(Exception e){
		logger.error(e.getMessage(), e);
		return ReturnResult.error();
	}
}
