package com.itwill.main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.itwill.manager.SubjectManager;
import com.itwill.vo.SubjectVO;

public class SubjectManagerTestMain {

	public static void main(String[] args) throws Exception {
		SubjectManager subjectManager = new SubjectManager();

		System.out.println("---------------과목등록하기--------------");
		SubjectVO uploadsubject = new SubjectVO("자료구조", "전도홍", "목123", "공학관101");
		boolean isSuccess = subjectManager.SubjectPlus(uploadsubject);
		System.out.println("isSuccess: " + isSuccess);

		if (!isSuccess) {
			System.out.println("과목중복 다시해봥ㅋ");
		}

		System.out.println("---------------입력한 과목의 정보 수정-------------");
		SubjectVO updateMember = new SubjectVO("JAVA", "박지연", "월789", "공학관320");
		subjectManager.subjectUpdate(updateMember);

		System.out.println("------입력한 과목의 정보 삭제-------");
		try {
			subjectManager.subjectDelete("C++");
		} catch (SubNameNotFoundExecption e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

		System.out.println("---------------과목 전체 정보 출력-------------");
		ArrayList<SubjectVO> subjectList = subjectManager.getsubjectList();
		for (SubjectVO subjectVO : subjectList) {
			System.out.println(subjectVO);
		}

	}
}
