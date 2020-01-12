package com.itwill.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminVO implements Serializable {

	private String name; // 이름
	private String joomin; // 주민번호
	private String callnumber; // 폰번호

	public AdminVO() {
		// TODO Auto-generated constructor stub
	}

	public AdminVO(String name, String joomin, String callnumber) {
		super();
		this.joomin = joomin;
		this.callnumber = callnumber;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJoomin() {
		return joomin;
	}

	public void setJoomin(String joomin) {
		this.joomin = joomin;
	}

	public String getCallnumber() {
		return callnumber;
	}

	public void setCallnumber(String callnumber) {
		this.callnumber = callnumber;
	}

	/*
	 * 출력문
	 */
	@Override
	public String toString() {
		return name + "\t" + joomin + "\t" + callnumber;
	}

	/*
	 * 비밀번호 설정 주민번호 앞자리와 입력한 비밀번호가 일치하면 ok
	 */
	public boolean matchPassword(String pw) {
		if (this.joomin.equals(pw)) {
			return true;
		} else {
			return false;
		}

	}

}