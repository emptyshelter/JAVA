/*
 * VO(Value Object), DTO(Data Transfer Object), �����ΰ�ü
 *  - ��� 1���� ����Ÿ�� ������ �ִ� ��ü
 *  - ���� 1�� ���ڵ�, ���̺� �Ѱ��� row ����Ÿ�� ������ ��ü
 */
package com.itwill.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StudentVo implements Serializable {

	// private String stId; // �л� ���̵�
	private String stName; // �л� �̸�
	private String birthDate; // �������
	private String phonNumber; // ����ȣ

	private String subject; // ����
	private String lectRoom; // C���ǽ�
	private String lectTime; // c���ǽð�
	private String professor; // C ����

	public StudentVo() {
	}

	public StudentVo(String subject, String lectRoom, String lectTime) {
		this.subject = subject;
		this.lectRoom = lectRoom;
		this.lectTime = lectTime;
	}

	public StudentVo(String subject, String lectRoom, String lectTime, String professor) {
		this.subject = subject;
		this.lectRoom = lectRoom;
		this.lectTime = lectTime;
		this.professor = professor;
	}

	public StudentVo(String stName, String birthDate, String phonNumber, String subject, String lectRoom, String lectTime, String professor) {
		// this.stId = stId;
		this.stName = stName;
		this.birthDate = birthDate;
		this.phonNumber = phonNumber;
		this.subject = subject;
		this.lectRoom = lectRoom;
		this.lectTime = lectTime;
		this.professor = professor;
	}

	// public String getStId() {
	// return stId;
	// }

	// public void setStId(String stId) {
	// this.stId = stId;
	// }

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhonNumber() {
		return phonNumber;
	}

	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getLectRoom() {
		return lectRoom;
	}

	public void setLectRoom(String lectRoom) {
		this.lectRoom = lectRoom;
	}

	public String getLectTime() {
		return lectTime;
	}

	public void setLectTime(String lectTime) {
		this.lectTime = lectTime;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "�л����̺� [�̸� " + stName + ", �������: " + birthDate + ", ����ȣ: " + phonNumber + ", ����: "
				+ subject + ", ���ǽ�: " + lectRoom + ", ���ǽð�: " + lectTime + ", ������ " + professor + "]";
	}

}
