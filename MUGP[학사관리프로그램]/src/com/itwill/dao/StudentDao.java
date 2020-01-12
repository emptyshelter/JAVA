/*
 * DAO(Data Access Object)
 *  - 멤버들의 데이타를 저장하고 있는 파일(DB 테이블)에 CRUD(create, Read, Update, Delete)
 *    작업을 할수 있는 단위메쏘드(기능)를 가지고 있는 클래스.
 *  - MemberManager(MemberService)의 요청을 받아서 
 *    Data Access에 관련된 단위 기능(Create, Read, Update, Delete)을 수행하는 객체
 */
package com.itwill.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.itwill.vo.StudentVo;

public class StudentDao {

	/*
	 * 참고: Dao에서 멤버변수를 가지지 않는다.
	 */
	public StudentDao() throws Exception {

		File studentFile = new File("student.ser");

		if (!studentFile.exists()) {

			// 애플리케이션 최초실행시
			studentFile.createNewFile();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(studentFile));
			oos.writeObject(new ArrayList<StudentVo>());
			oos.close();
		}
	}

	/*
	 * File read (member.ser-->ArrayList<MemberVO>)
	 */
	@SuppressWarnings("unchecked")
	private ArrayList<StudentVo> fileRead() throws Exception {

		File studentFile = new File("student.ser");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(studentFile));
		ArrayList<StudentVo> studentList = (ArrayList<StudentVo>) ois.readObject();
		ois.close();
		return studentList;
	}

	/*
	 * File write --> ArrayList<MemberVo> --> member.ser
	 */
	private void fileWrite(ArrayList<StudentVo> studentList) throws Exception {

		File studentFile = new File("student.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(studentFile));
		oos.writeObject(studentList);
		oos.close();

	}

	public StudentVo selectByBirthDate(String birthDate) throws Exception {

		StudentVo findStudent = null;

		ArrayList<StudentVo> studentList = this.fileRead();

		for (StudentVo studentVo : studentList) {
			if (studentVo.getBirthDate().equals(birthDate)) {
				findStudent = studentVo;
				break;
			}
		}
		return findStudent;
	}

	/*
	 * Create
	 * 
	 * - Student 한명을 추가 StudentVo가 transfer 해주고 있다.
	 */
	public void insertCourse(StudentVo insertStudent) throws Exception {

		ArrayList<StudentVo> studentList = this.fileRead();
		studentList.add(insertStudent);
		this.fileWrite(studentList);
		
		
	}

	/*
	 * Read
	 * 
	 * - Member 한명을 학번으로 select
	 */
	/*
	 * String[] splitData = card_no.split("-");
	 * 
	 * String lastCardNo = splitData[splitData.length - 1];
	 * 
	 * System.out.println("lastCardNo: " + lastCardNo);
	 */
	public StudentVo selectByName(String name) throws Exception {

		StudentVo findStudent = null;

		ArrayList<StudentVo> studentList = this.fileRead();

		for (StudentVo studentVo : studentList) {

			// 학번 조회
			// String[] splitData = studentVo.getBirthDate().split("-");
			// String undergrad = splitData[splitData.length - 1];
			if (studentVo.getStName().equals(name)) {
				findStudent = studentVo;
				break;
			}
		}
		return findStudent;
	}

	/*
	 * Update
	 * 
	 * - Student 한명 수정
	 */
	public boolean updateByStudent(StudentVo updateVo) throws Exception {

		boolean flag = false;
		
		ArrayList<StudentVo> studentList = this.fileRead();
		
	

		for (int i = 0; i < studentList.size(); i++) {
			
			StudentVo tempMemberVO = studentList.get(i);
			// if (updateVo.getBirthDate().equals(tempMemberVO.getBirthDate()))
			// {
			if (updateVo.getStName().equals(tempMemberVO.getStName())) {
				
				if (updateVo.getLectRoom() == null) {
					updateVo.setLectRoom(tempMemberVO.getLectRoom());
				}
				if (updateVo.getLectTime() == null) {
					updateVo.setLectTime(tempMemberVO.getLectTime());
				}
				if (updateVo.getProfessor() == null) {
					updateVo.setProfessor(tempMemberVO.getProfessor());
				}
				if (updateVo.getSubject() == null) {
					updateVo.setSubject(tempMemberVO.getSubject());
				}
				
				studentList.set(i, updateVo);
				
				flag = true;
				
				break;
			}
		}
		this.fileWrite(studentList);
		return flag;
	}

}
