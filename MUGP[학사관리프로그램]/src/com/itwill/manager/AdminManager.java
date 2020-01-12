package com.itwill.manager;

import java.util.ArrayList;

import com.itwill.dao.AdminDAO;
import com.itwill.dao.RecordDao;
import com.itwill.vo.AdminVO;
import com.itwill.vo.RecordVo;

public class AdminManager {

	/*
	 * public boolean joinMember(MemberVO joinMember) throws Exception{
	 * MemberDAO memberDAO = new MemberDAO(); } �̰ſ� �Ʒ��� ��������
	 */
	private AdminDAO adminDAO;
	private String nowLogin;
	private RecordDao recordDao;

	public AdminManager() throws Exception {
		adminDAO = new AdminDAO();
		recordDao = new RecordDao();
	}

	/*
	 * �л����(�ߺ��˻�, -->�ߺ������� ���Խ�Ŵ)
	 */
	public boolean joinMember(AdminVO joinMember) throws Exception {
		boolean joinSuccess = true;
		RecordVo recordVo = new RecordVo(joinMember.getName(), joinMember.getJoomin(), joinMember.getCallnumber(), 0, 0, 0);
		// MemberDAO memberDAO = new MemberDAO();
		/*
		 * 1. �̸����ε� ���̵� �ߺ�üũ 2-1. �ߺ����� ������ ���Խ���(Data Access) 2-2. �ߺ��Ǹ� ���Ծ�����
		 */
		AdminVO findMember = adminDAO.selectByName(joinMember.getName());
		if (findMember == null) {
			adminDAO.insert(joinMember);
			recordDao.insert(recordVo);
			joinSuccess = true;
		} else {
			joinSuccess = false;
		}
		return joinSuccess;

	}

	/*
	 * �α���
	 */
	public boolean login(String name, String password) throws Exception {
		boolean loginSuccess = false;
		/*
		 * ID���翩��
		 */
		AdminVO findMember = adminDAO.selectByName(name);
		if (findMember != null) {
			/*
			 * name�� ������ ��� �н����� ��ġ Ȯ��
			 */
			if (findMember.matchPassword(password)) {
				loginSuccess = true;
				nowLogin = name;//�߰�...
				// �н����� ��ġ, �α��� ����
			} else {
				// �н����� ����ġ, �α��� ����
				loginSuccess = false;
			}

		} else {
			/*
			 * id�� ����� �� ��� �н����� �˻�(x)
			 */
			loginSuccess = false;

		}

		return loginSuccess;
	}

	/*
	 * ��ü �л� ���� ����Ʈ
	 */
	public ArrayList<AdminVO> getmemberList() throws Exception {
		AdminDAO adminDAO = new AdminDAO();

		return adminDAO.selectAll();
	}

	/*
	 * �л����� ����
	 */
	public void memberUpdate(AdminVO updateMember) throws Exception {

		adminDAO.updateByName(updateMember);
	}

	/*
	 * �л����̵� ����(�̸�����)
	 */
	public void memberDelete(String name) throws Exception {
		adminDAO.deleteByName(name);

	}

	public String getNowLogin() {
		return nowLogin;
	}

	public void setNowLogin(String nowLogin) {
		this.nowLogin = nowLogin;
	}
	
	
}
