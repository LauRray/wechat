package com.feihu.first.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.feihu.first.util.Result;

public abstract class AbstractController {
	/**
	 * 在其他控制器方法执行出现异常时候, 执行 异常处理方法 handleException
	 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Object handleException(Exception e) {

		return new Result(500, "失败", e.getMessage());
	}

}
