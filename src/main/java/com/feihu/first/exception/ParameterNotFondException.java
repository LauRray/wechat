package com.feihu.first.exception;

import java.io.Serializable;

public class ParameterNotFondException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 149984736035924565L;

	public ParameterNotFondException() {
	}

	public ParameterNotFondException(String message) {
		super(message);
	}

	public ParameterNotFondException(Throwable cause) {
		super(cause);
	}

	public ParameterNotFondException(String message, Throwable cause) {
		super(message, cause);
	}

	public ParameterNotFondException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
