package com.itwill.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProfessorVo implements Serializable {

	private int pNo; // ������ȣ
	private String pName; // �����̸�
	private String subject; // ����
	private String subjectP; // ���� ��ȹ
	private String pRoom; // ������
	private String bookName; // ����
	private String bookWriter; // ����
	private String bookMaker; // ���ǻ�

	public ProfessorVo() {

	}

	public ProfessorVo(int pNo, String pName, String subject, String subjectP, String pRoom, String bookName,
			String bookWriter, String bookMaker) {
		this.pNo = pNo;
		this.pName = pName;
		this.subject = subject;
		this.subjectP = subjectP;
		this.pRoom = pRoom;
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookMaker = bookMaker;
	}

	@Override
	public String toString() {

		return pNo + "\t" + pName + "\t" + subject + "\t" + subjectP + "\t" + pRoom + "\t" + bookName + "\t"
				+ bookWriter + "\t" + bookMaker;
	}

	public int getpNo() {
		return pNo;
	}

	public void setpNo(int pNo) {
		this.pNo = pNo;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubjectP() {
		return subjectP;
	}

	public void setSubjectP(String subjectP) {
		this.subjectP = subjectP;
	}

	public String getpRoom() {
		return pRoom;
	}

	public void setpRoom(String pRoom) {
		this.pRoom = pRoom;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public String getBookMaker() {
		return bookMaker;
	}

	public void setBookMaker(String bookMaker) {
		this.bookMaker = bookMaker;
	}

}
