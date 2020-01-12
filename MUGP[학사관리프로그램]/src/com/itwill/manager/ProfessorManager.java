package com.itwill.manager;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.itwill.dao.AdminDAO;
import com.itwill.dao.ProfessorDao;
import com.itwill.dao.RecordDao;
import com.itwill.vo.AdminVO;
import com.itwill.vo.ProfessorVo;
import com.itwill.vo.RecordVo;

public class ProfessorManager {
	ProfessorDao professorDao;
	RecordDao recordDao;
	AdminDAO adminDao;

	public ProfessorManager() throws Exception {
		professorDao = new ProfessorDao();
		recordDao = new RecordDao();
		adminDao = new AdminDAO();
	}

	/* 학생 과목 전체 반환 */
	@SuppressWarnings("unused")
	public ArrayList<RecordVo> findSubjectStudent(String subject) throws Exception {
//		ArrayList<RecordVo> recordList = new ArrayList<RecordVo>();
		ArrayList<RecordVo> templist = (ArrayList<RecordVo>) recordDao.selectAll();
		String str = "";
		for (int i = 0; i < templist.size(); i++) {
			if (templist.get(i).getSubject1Name().equals(subject)) {
//				str += templist.get(i).getNameStudent() + "\t";
//				str += templist.get(i).getBirth() + "\t";
//				str += templist.get(i).getPhoneNum() + "\t";
//				str += templist.get(i).getSubject1Name() + "\t";
//				str += templist.get(i).getsubjectScore1() + "\n";
//				recordList.add(str);
//				str = "";
//				recordList = templist;

//			} else if (templist.get(i).getSubject2Name().equals(subject)) {
//				str += templist.get(i).getNameStudent() + "\t";
//				str += templist.get(i).getBirth() + "\t";
//				str += templist.get(i).getPhoneNum() + "\t";
//				str += templist.get(i).getSubject2Name() + "\t";
//				str += templist.get(i).getsubjectScore2() + "\n";
//				recordList.add(str);
//				str = "";
//
//			} else if (templist.get(i).getSubject3Name().equals(subject)) {
//				str += templist.get(i).getNameStudent() + "\t";
//				str += templist.get(i).getBirth() + "\t";
//				str += templist.get(i).getPhoneNum() + "\t";
//				str += templist.get(i).getSubject3Name() + "\t";
//				str += templist.get(i).getsubjectScore3() + "\n";
//				recordList.add(str);
//				str = "";

			}

		}
		return templist;
	}

	public ProfessorVo findSubjectPlan(int number) throws Exception {
		ProfessorVo fsp = professorDao.selectByPN(number);
		return fsp;
	}
	
	public void professorSujung(ProfessorVo professorVo)throws Exception{
		professorDao.updateByPN(professorVo);
	}

	public boolean inputScore(RecordVo recordvo) throws Exception {
		boolean joinSuccess = false;

		/*
		 * 1-1. 학생 번호 중복체크(Data Access) 2-1. 중복되지않으면 성적기입(Data Access) 2-2. 중복되면
		 * 기입안함
		 */
		AdminVO inputSuccess = adminDao.selectByName(recordvo.getNameStudent());
		if(inputSuccess != null){
			
			boolean is = recordDao.selectById(recordvo);
			if(is){
				JOptionPane.showMessageDialog(null, "성공");
			}else{
				JOptionPane.showMessageDialog(null, "실패");
			}
			joinSuccess = true;
		}


		return joinSuccess;
	}
	
	public boolean findPro(String id) throws Exception{
		boolean isfind = false;
		ArrayList<ProfessorVo> find = professorDao.selectAll();
		for (ProfessorVo professorVo : find) {
			if(professorVo.getpName().equals(id)){
				isfind = true;
			}
		}
		
		return isfind;
	}
	

}
