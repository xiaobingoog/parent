package com.common.exception;

/**
 * Author: xiaobingoog
 * Email: xiaobingoog@qq.com
 * Date: 2017-5-22
 */
public class HttpsException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HttpsException() {
        super();
    }

    public HttpsException(String message) {
        super(message);
    }

    public HttpsException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpsException(Throwable cause) {
        super(cause);
    }

    protected HttpsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
