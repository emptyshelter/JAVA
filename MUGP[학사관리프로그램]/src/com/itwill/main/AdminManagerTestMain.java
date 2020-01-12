package com.itwill.main;

import com.itwill.manager.AdminManager;
import com.itwill.vo.AdminVO;

public class AdminManagerTestMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		AdminManager memberManager = new AdminManager();

		System.out.println("---------------회원가입하기--------------");
		AdminVO joinMember;
		joinMember = new AdminVO("관리자", "123456", "01051190122");
//		joinMember = new AdminVO("김성훈", "910122", "01051190122");
//		joinMember = new AdminVO("나호준", "890117", "01023456789");
//		joinMember = new AdminVO("남민지", "930201", "01012345678");
//		joinMember = new AdminVO("박준호", "920303", "01034567890");
//		joinMember = new AdminVO("정대현", "830707", "01025229099");
//		joinMember = new AdminVO("박슬기", "960409", "01036251487");
		
//		boolean isSuccess = memberManager.joinMember(joinMember);
//		System.out.println("isSuccess: " + isSuccess);
//
//		if (!isSuccess) {
//			System.out.println("이름 중복 다시해봥ㅋ");
//		}
//
//		System.out.println("-------------로그인----------------");
//		String name = "정대현";
//		String pw = "830707";
//		boolean loginSuccess = memberManager.login(name, pw);
//		if (loginSuccess) {
//			System.out.println(name + " 님 로그인을 성공햇습니다 방가루");
//		} else {
//			System.out.println(name + " 님 로그인 실패함");
//		}

		/*
		System.out.println("---------------입력한 학생의 정보 수정-------------");
		AdminVO updateMember = new AdminVO("손오공", "751225", "01056569898");
		memberManager.memberUpdate(updateMember);
		*/
		
		// System.out.println("------입력한 학생의 정보 삭제-------");
		// try {
		// memberManager.memberDelete("유재송");
		// } catch (NameNotFoundExecption e) {
		// JOptionPane.showMessageDialog(null, e.getMessage());
		// }
		//
		// System.out.println("---------------회원 전체 정보 출력-------------");
		// ArrayList<AdminVO> memberList = memberManager.getmemberList();
		// for (AdminVO memberVO : memberList) {
		// System.out.println(memberVO);
		// }

	}

}
