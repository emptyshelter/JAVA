package com.itwill.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SubjectVO implements Serializable {
	/*
	 * ���� ���� �ð� ���ǽ�
	 */
	private String sub; // ����
	private String prof; // ����
	private String time; // ���ǽð�
	private String room; // ���ǽ�

	public SubjectVO() {
		// TODO Auto-generated constructor stub
	}

	public SubjectVO(String sub, String prof, String time, String room) {
		super();
		this.sub = sub;
		this.prof = prof;
		this.time = time;
		this.room = room;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	// ������Ʈ ����� ����Ű Alt+ctrl+s+s
	@Override
	public String toString() {
		return "SubjectVO [sub=" + sub + ", prof=" + prof + ", time=" + time + ", room=" + room + "]";
	}
}
