package com.feihu.first.exception;

import java.io.Serializable;

public class CommunicationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 149984736035924565L;

	public CommunicationException() {
	}

	public CommunicationException(String message) {
		super(message);
	}

	public CommunicationException(Throwable cause) {
		super(cause);
	}

	public CommunicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public CommunicationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
