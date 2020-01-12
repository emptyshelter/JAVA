package com.itwill.manager;

import java.util.ArrayList;

import com.itwill.dao.AdminDAO;
import com.itwill.dao.RecordDao;
import com.itwill.vo.AdminVO;
import com.itwill.vo.RecordVo;

public class AdminManager {

	/*
	 * public boolean joinMember(MemberVO joinMember) throws Exception{
	 * MemberDAO memberDAO = new MemberDAO(); } 이거와 아래꺼 같은거임
	 */
	private AdminDAO adminDAO;
	private String nowLogin;
	private RecordDao recordDao;

	public AdminManager() throws Exception {
		adminDAO = new AdminDAO();
		recordDao = new RecordDao();
	}

	/*
	 * 학생등록(중복검사, -->중복없으면 가입시킴)
	 */
	public boolean joinMember(AdminVO joinMember) throws Exception {
		boolean joinSuccess = true;
		RecordVo recordVo = new RecordVo(joinMember.getName(), joinMember.getJoomin(), joinMember.getCallnumber(), 0, 0, 0);
		// MemberDAO memberDAO = new MemberDAO();
		/*
		 * 1. 이름으로된 아이디 중복체크 2-1. 중복되지 않으면 가입승인(Data Access) 2-2. 중복되면 가입안해줌
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
	 * 로그인
	 */
	public boolean login(String name, String password) throws Exception {
		boolean loginSuccess = false;
		/*
		 * ID존재여부
		 */
		AdminVO findMember = adminDAO.selectByName(name);
		if (findMember != null) {
			/*
			 * name이 존재할 경우 패스워드 일치 확인
			 */
			if (findMember.matchPassword(password)) {
				loginSuccess = true;
				nowLogin = name;//추가...
				// 패스워드 일치, 로그인 성공
			} else {
				// 패스워드 불일치, 로그인 실패
				loginSuccess = false;
			}

		} else {
			/*
			 * id가 존재안 할 경우 패스워드 검사(x)
			 */
			loginSuccess = false;

		}

		return loginSuccess;
	}

	/*
	 * 전체 학생 정보 리스트
	 */
	public ArrayList<AdminVO> getmemberList() throws Exception {
		AdminDAO adminDAO = new AdminDAO();

		return adminDAO.selectAll();
	}

	/*
	 * 학생정보 수정
	 */
	public void memberUpdate(AdminVO updateMember) throws Exception {

		adminDAO.updateByName(updateMember);
	}

	/*
	 * 학생아이디 삭제(이름으로)
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
