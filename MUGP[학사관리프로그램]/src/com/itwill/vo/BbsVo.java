package com.itwill.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BbsVo implements Serializable {

	/*
	 * 공지사항 타입 A, B
	 * 
	 * 제목
	 * 
	 * 작성자
	 * 
	 * 작성시간
	 * 
	 * 내용
	 * 
	 * 글번호
	 */
	private String no;
	private String title;
	private String writer;
	private String time;
	private String text;

	public BbsVo(String no, String title, String writer, String time, String text) {
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.time = time;
		this.text = text;
	}

	public BbsVo() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return no + "\t" + title + "\t" + writer + "\t" + time + "\t" + text;
	}

}
