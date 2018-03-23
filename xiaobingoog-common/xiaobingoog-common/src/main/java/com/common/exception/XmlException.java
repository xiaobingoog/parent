package com.common.exception;

/**
 * Author: xiaobingoog
 * Email: xiaobingoog@qq.com
 * Date: 2017-5-22
 */
public class XmlException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public XmlException() {
        super();
    }

    public XmlException(String message) {
        super(message);
    }

    public XmlException(String message, Throwable cause) {
        super(message, cause);
    }

    public XmlException(Throwable cause) {
        super(cause);
    }

    protected XmlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
