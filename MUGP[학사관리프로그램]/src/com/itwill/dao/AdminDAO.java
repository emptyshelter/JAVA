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
		if (!adminFile.exists()) { // �������� �ʴ´ٸ�?
			// Application ���� �����
			adminFile.createNewFile();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(adminFile));
			oos.writeObject(new ArrayList<AdminVO>()); // ������ 0¥�� ��̸���Ʈ�� �ʱ�ȭ
			oos.close();
		}
	}

	/*
	 * File read admin.ser�� ����� ������ >> ArrayList<AdminVO>�� �����ϴ� �۾�
	 */
	@SuppressWarnings("unchecked")
	private ArrayList<AdminVO> fileRead() throws Exception {
		File adminFile = new File("admin.ser");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(adminFile));
		ArrayList<AdminVO> memberList = (ArrayList<AdminVO>) ois.readObject();
		// ois�� ȣ���ϸ� memberList�� ������
		ois.close();
		return memberList;

	}

	/*
	 * file write ArrayList<AdminVO>������ admin.ser�� ����
	 */
	private void fileWrite(ArrayList<AdminVO> memberList) throws Exception {
		File adminFile = new File("admin.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(adminFile));
		oos.writeObject(memberList);
		oos.close();

	}

	/*
	 * Create - �л� �� ���� �߰�
	 */
	public void insert(AdminVO insertmember) throws Exception {
		ArrayList<AdminVO> memberList = this.fileRead();
		memberList.add(insertmember);
		this.fileWrite(memberList);

	}

	/*
	 * Read - �л� �� ���� �̸����� select
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
	 * Read - ��� �л� select
	 */
	public ArrayList<AdminVO> selectAll() throws Exception {
		ArrayList<AdminVO> memberList = this.fileRead();
		return memberList;

		// return this.fileRead();

	}

	/*
	 * Update - �л� �� ���� ����
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
	 * Delete - �л� �Ѹ��� �̸����� ã�Ƽ� Delete
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
			throw new NameNotFoundExecption(name + " �� ���������ʴ� ���̵��Դϴ�.");
		}
		return;
	}

}
