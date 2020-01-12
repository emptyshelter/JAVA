package com.itwill.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RecordVo implements Serializable{
	
	private String nameStudent;
	private String birth;
	private String phoneNum;
	private String subject1Name;
	private String subject2Name;
	private String subject3Name;
	private int subjectScore1;
	private int subjectScore2;
	private int subjectScore3;
	private int subject1Avg;
	private int subject2Avg;
	private int subject3Avg;
	private int subject1Rank = 1;
	private int subject2Rank = 1;
	private int subject3Rank = 1;
	private int totalScore;
	private int avgT;
	private int rankT = 1;

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public int getAvgT() {
		return avgT;
	}

	public void setAvgT(int avgT) {
		this.avgT = avgT;
	}

	public int getRankT() {
		return rankT;
	}

	public void setRankT(int rankT) {
		this.rankT = rankT;
	}

	public String getSubject1Name() {
		return subject1Name;
	}

	public void setSubject1Name(String subject1Name) {
		this.subject1Name = subject1Name;
	}

	public String getSubject2Name() {
		return subject2Name;
	}

	public void setSubject2Name(String subject2Name) {
		this.subject2Name = subject2Name;
	}

	public String getSubject3Name() {
		return subject3Name;
	}

	public void setSubject3Name(String subject3Name) {
		this.subject3Name = subject3Name;
	}

	public int getsubjectScore1() {
		return subjectScore1;
	}

	public void setsubjectScore1(int subjectScore1) {
		this.subjectScore1 = subjectScore1;
	}

	public int getsubjectScore2() {
		return subjectScore2;
	}

	public void setsubjectScore2(int subjectScore2) {
		this.subjectScore2 = subjectScore2;
	}

	public int getsubjectScore3() {
		return subjectScore3;
	}

	public void setsubjectScore3(int subjectScore3) {
		this.subjectScore3 = subjectScore3;
	}

	public int getSubject1Avg() {
		return subject1Avg;
	}

	public void setSubject1Avg(int subject1Avg) {
		this.subject1Avg = subject1Avg;
	}

	public int getSubject2Avg() {
		return subject2Avg;
	}

	public void setSubject2Avg(int subject2Avg) {
		this.subject2Avg = subject2Avg;
	}

	public int getSubject3Avg() {
		return subject3Avg;
	}

	public void setSubject3Avg(int subject3Avg) {
		this.subject3Avg = subject3Avg;
	}

	public int getSubject1Rank() {
		return subject1Rank;
	}

	public void setSubject1Rank(int subject1Rank) {
		this.subject1Rank = subject1Rank;
	}

	public int getSubject2Rank() {
		return subject2Rank;
	}

	public void setSubject2Rank(int subject2Rank) {
		this.subject2Rank = subject2Rank;
	}

	public int getSubject3Rank() {
		return subject3Rank;
	}

	public void setSubject3Rank(int subject3Rank) {
		this.subject3Rank = subject3Rank;
	}

	public RecordVo(String nameStudent, String birth, String phoneNum, int subjectScore1, int subjectScore2, int subjectScore3) {
		
		this.nameStudent = nameStudent;
		this.birth = birth;
		this.phoneNum = phoneNum;
		this.subject1Name = "리눅스";
		this.subjectScore1 = subjectScore1;
		this.subject2Name = "C언어";
		this.subjectScore2 = subjectScore2;
		this.subject3Name = "자바";
		this.subjectScore3 = subjectScore3;
/*		this.subject1 = new Subject(subject1Name, subjectScore1);
		this.subject2 = new Subject(subject2Name, subjectScore2);
		this.subject3 = new Subject(subject3Name, subjectScore3);
		this.subject1.setSubjectName(subject1Name);
		this.subject1.setScore(subjectScore1);
		this.subject2.setSubjectName(subject2Name);
		this.subject2.setScore(subjectScore2);
		this.subject3.setSubjectName(subject3Name);
		this.subject3.setScore(subjectScore3);
*/		
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
/*
	public Subject getSubject1() {
		return subject1;
	}

	public void setSubject1(Subject subject1) {
		this.subject1 = subject1;
	}

	public Subject getSubject2() {
		return subject2;
	}

	public void setSubject2(Subject subject2) {
		this.subject2 = subject2;
	}

	public Subject getSubject3() {
		return subject3;
	}

	public void setSubject3(Subject subject3) {
		this.subject3 = subject3;
	}
*/	
	public String getId(){
		return getNameStudent();
	}
	
	@Override
	public String toString() {
		
		return subject1Name + "\t" + subjectScore1 + "\t" + subject1Avg + "\t"+subject1Rank + "\n" +subject2Name + "\t" + subjectScore2 + "\t" + subject2Avg + "\t"+subject2Rank + "\n" +subject3Name + "\t" + subjectScore3 + "\t" + subject3Avg + "\t"+subject3Rank + "\n";
		//return subject1.getSubjectName()+"\t"+subject1.getScore()+"\t"+subject1.getRankS()+"\n"+subject2.getSubjectName()+"\t"+subject2.getScore()+"\t"+"\n"+subject3.getSubjectName()+"\t"+subject3.getScore();
		//return subject1.getSubjectName()+"\t"+subject1.getScore()+"\t"+subject1.getAvgS()+"\t"+subject1.getRankS()+"\n"+subject2.getSubjectName()+"\t"+subject2.getScore()+"\t"+subject2.getAvgS()+"\t"+"\n"+subject3.getSubjectName()+"\t"+subject3.getScore()+"\t"+subject3.getAvgS();
	}

}
