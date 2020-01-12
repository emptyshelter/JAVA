/*
 * DAO(Data Access Object)
 *  - ������� ����Ÿ�� �����ϰ� �ִ� ����(DB ���̺�)�� CRUD(create, Read, Update, Delete)
 *    �۾��� �Ҽ� �ִ� �����޽��(���)�� ������ �ִ� Ŭ����.
 *  - MemberManager(MemberService)�� ��û�� �޾Ƽ� 
 *    Data Access�� ���õ� ���� ���(Create, Read, Update, Delete)�� �����ϴ� ��ü
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
	 * ����: Dao���� ��������� ������ �ʴ´�.
	 */
	public StudentDao() throws Exception {

		File studentFile = new File("student.ser");

		if (!studentFile.exists()) {

			// ���ø����̼� ���ʽ����
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
	 * - Student �Ѹ��� �߰� StudentVo�� transfer ���ְ� �ִ�.
	 */
	public void insertCourse(StudentVo insertStudent) throws Exception {

		ArrayList<StudentVo> studentList = this.fileRead();
		studentList.add(insertStudent);
		this.fileWrite(studentList);
		
		
	}

	/*
	 * Read
	 * 
	 * - Member �Ѹ��� �й����� select
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

			// �й� ��ȸ
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
	 * - Student �Ѹ� ����
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
