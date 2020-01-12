package com.itwill.main;

@SuppressWarnings("serial")
public class SubNameNotFoundExecption extends Exception { // 이건 비지니스의 엑셉션임
	public SubNameNotFoundExecption() {

	}

	public SubNameNotFoundExecption(String msg) {
		super(msg);
	}

}