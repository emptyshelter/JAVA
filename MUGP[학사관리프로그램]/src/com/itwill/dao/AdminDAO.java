package com.itwill.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.itwill.main.NameNotFoundExecption;
import com.itwill.vo.AdminVO;

public class AdminDAO {

	public AdminDAO() throws Exception {
		
//		File adminFileDir = new File(AdminDAO.class.getResource("/file").getPath());
		
		File adminFile = new File("admin.ser");
		
//		File adminFile = new File("admin.ser");
		if (!adminFile.exists()) { // 존재하지 않는다면?
			// Application 최초 실행시
			adminFile.createNewFile();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(adminFile));
			oos.writeObject(new ArrayList<AdminVO>()); // 사이즈 0짜리 어레이리스트를 초기화
			oos.close();
		}
	}

	/*
	 * File read admin.ser에 저장된 파일을 >> ArrayList<AdminVO>로 변경하는 작업
	 */
	@SuppressWarnings("unchecked")
	private ArrayList<AdminVO> fileRead() throws Exception {
		File adminFile = new File("admin.ser");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(adminFile));
		ArrayList<AdminVO> memberList = (ArrayList<AdminVO>) ois.readObject();
		// ois를 호출하면 memberList가 딱나옴
		ois.close();
		return memberList;

	}

	/*
	 * file write ArrayList<AdminVO>파일을 admin.ser로 변경
	 */
	private void fileWrite(ArrayList<AdminVO> memberList) throws Exception {
		File adminFile = new File("admin.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(adminFile));
		oos.writeObject(memberList);
		oos.close();

	}

	/*
	 * Create - 학생 한 명을 추가
	 */
	public void insert(AdminVO insertmember) throws Exception {
		ArrayList<AdminVO> memberList = this.fileRead();
		memberList.add(insertmember);
		this.fileWrite(memberList);

	}

	/*
	 * Read - 학생 한 명을 이름으로 select
	 */
	public AdminVO selectByName(String name) throws Exception {
		AdminVO findMember = null;
		ArrayList<AdminVO> memberList = fileRead();
		for (AdminVO adminVo : memberList) {
			if (adminVo.getName().equals(name)) {
				findMember = adminVo;
				break;
			}
		}
		return findMember;

	}

	/*
	 * Read - 모든 학생 select
	 */
	public ArrayList<AdminVO> selectAll() throws Exception {
		ArrayList<AdminVO> memberList = this.fileRead();
		return memberList;

		// return this.fileRead();

	}

	/*
	 * Update - 학생 한 명의 수정
	 */
	public void updateByName(AdminVO updateVO) throws Exception {

		ArrayList<AdminVO> memberlist = this.fileRead();
		for (int i = 0; i < memberlist.size(); i++) {
			AdminVO tempMemberVO = memberlist.get(i);
			if (updateVO.getName().equals(tempMemberVO.getName())) {
				memberlist.set(i, updateVO);
				break;
			}
		}
		this.fileWrite(memberlist);
	}

	/*
	 * Delete - 학생 한명을 이름으로 찾아서 Delete
	 */
	public void deleteByName(String name) throws Exception {
		ArrayList<AdminVO> memberList = this.fileRead();
		boolean existName = false;
		for (int i = 0; i < memberList.size(); i++) {
			AdminVO tempMemberVO = memberList.get(i);
			if (tempMemberVO.getName().equals(name)) {
				memberList.remove(i);
				existName = true;
				break;
			}
		}
		this.fileWrite(memberList);

		if (!existName) {
			throw new NameNotFoundExecption(name + " 는 존재하지않는 아이디입니다.");
		}
		return;
	}

}
