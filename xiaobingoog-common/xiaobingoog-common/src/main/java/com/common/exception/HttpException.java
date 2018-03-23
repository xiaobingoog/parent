package com.common.exception;

/**
 * Author: xiaobingoog
 * Email: xiaobingoog@qq.com
 * Date: 2017-5-22
 */
public class HttpException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HttpException() {
        super();
    }

    public HttpException(String message) {
        super(message);
    }

    public HttpException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpException(Throwable cause) {
        super(cause);
    }

    protected HttpException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
