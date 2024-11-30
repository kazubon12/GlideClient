package me.eldodebug.soar.mp3agic.exception;

import me.eldodebug.soar.mp3agic.BaseException;

public class NoSuchTagException extends BaseException {

	private static final long serialVersionUID = 1L;

	public NoSuchTagException() {
		super();
	}

	public NoSuchTagException(String message) {
		super(message);
	}

	public NoSuchTagException(String message, Throwable cause) {
		super(message, cause);
	}
}
