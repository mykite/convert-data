package com.kite.convert.rowcolumn.exception;

/**
 * 
 * 类ConvertException的实现描述：转换异常 
 * @author pengliang 2017年2月27日 上午10:47:37
 */
public class ConvertException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8203036315877455323L;

	public ConvertException() {
		super();
	}

	public ConvertException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ConvertException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConvertException(String message) {
		super(message);
	}

	public ConvertException(Throwable cause) {
		super(cause);
	}

	
}
