/*
 * VO(Value Object), DTO(Data Transfer Object), 도메인객체
 *  - 멤버 1명의 데이타를 가지고 있는 객체
 *  - 파일 1개 레코드, 테이블 한개의 row 데이타를 가지는 객체
 */
package com.itwill.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StudentVo implements Serializable {

	// private String stId; // 학생 아이디
	private String stName; // 학생 이름
	private String birthDate; // 생년월일
	private String phonNumber; // 폰번호

	private String subject; // 과목
	private String lectRoom; // C강의실
	private String lectTime; // c강의시간
	private String professor; // C 교수

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
		return "학생테이블 [이름 " + stName + ", 생년월일: " + birthDate + ", 폰번호: " + phonNumber + ", 과목: "
				+ subject + ", 강의실: " + lectRoom + ", 강의시간: " + lectTime + ", 교수님 " + professor + "]";
	}

}
