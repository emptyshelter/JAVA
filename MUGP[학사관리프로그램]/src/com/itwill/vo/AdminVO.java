package com.itwill.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminVO implements Serializable {

	private String name; // �̸�
	private String joomin; // �ֹι�ȣ
	private String callnumber; // ����ȣ

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
	 * ��¹�
	 */
	@Override
	public String toString() {
		return name + "\t" + joomin + "\t" + callnumber;
	}

	/*
	 * ��й�ȣ ���� �ֹι�ȣ ���ڸ��� �Է��� ��й�ȣ�� ��ġ�ϸ� ok
	 */
	public boolean matchPassword(String pw) {
		if (this.joomin.equals(pw)) {
			return true;
		} else {
			return false;
		}

	}

}