package com.itwill.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.itwill.vo.BbsVo;

public class BbsDao {
	private ArrayList<BbsVo> bbs;

	public BbsDao() throws Exception {

		File bbsFile = new File("bbs.txt");

		if (!bbsFile.exists()) {
			bbsFile.createNewFile();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(bbsFile));
			bbs = new ArrayList<BbsVo>();

			bbs.add(new BbsVo("1", "홈페이지가 개설되었습니다.", "관리자", "2017.04.02 12:00:21", "가입하신 분들 환영합니다"));
			bbs.add(new BbsVo("2", "공지사항입니다.", "관리자", "2017.04.03 13:32:22",
					"1. 학생은 각자 정보를 학생 탭에서 확인이 가능합니다.\n2. 질문이나 공지사항 이외의 글은 자유게시판에 있습니다."));
			bbs.add(new BbsVo("3", "2017학년도 제1학기 등록금 추가납부 안내.", "관리자", "2017.04.05 13:45:12",
					"2017학년도 제1학기 등록금 추가수납 계획을 다음과 같이 알려드리니,자세한 내용은 붙임 안내문을 참조하시기 바랍니다."));
			bbs.add(new BbsVo("4", "제71회 전기 학위수여식 및 2017학년도 입학식 안내", "관리자", "2017.04.06 07:04:21", "서류제출 기간이 짧으니 구비서류를 미리 준비해야 함"));
			bbs.add(new BbsVo("5", "2017년도 학부 신입생 관악학생생활관 입주 신청 안내", "관리자", "2017.04.08 17:54:12", "입주 신청 기간: 2017. 4. 6(월) 10:00 ~ 4. 9(목) 18:00"));
			bbs.add(new BbsVo("6", "[언어교육원] 8월 YBM어학특강 수강안내", "관리자", "2017.04.10 14:22:43", "-TEPS실전반, 신TOEIC실전반, TOEIC Speaking반\n-TOEFL LC/RC실전반, TOEFL Speaking/Writing반"));
			
			oos.writeObject(new ArrayList<BbsVo>());
			this.fileWrite(bbs);
			oos.close();
		}
	}

	@SuppressWarnings("unchecked")
	private ArrayList<BbsVo> fileRead() throws Exception {
		File bbsFile = new File("bbs.txt");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(bbsFile));
		ArrayList<BbsVo> bbsList = (ArrayList<BbsVo>) ois.readObject();
		ois.close();
		return bbsList;

	}

	private void fileWrite(ArrayList<BbsVo> bbsList) throws Exception {
		File bbsFile = new File("bbs.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(bbsFile));
		oos.writeObject(bbsList);
		oos.close();

	}

	public void insert(BbsVo insertBbs) throws Exception {
		ArrayList<BbsVo> bbsList = this.fileRead();
		bbsList.add(insertBbs);
		this.fileWrite(bbsList);

	}

	public BbsVo selectedByNo(String no) throws Exception {
		BbsVo selectedThing = null;
		ArrayList<BbsVo> bbsList = this.fileRead();
		for (BbsVo bbsVo : bbsList) {
			if (bbsVo.getNo().equals(no)) {
				selectedThing = bbsVo;
			}
		}
		return selectedThing;
	}

	public ArrayList<BbsVo> selectAll() throws Exception {
		ArrayList<BbsVo> bbsList = this.fileRead();
		return bbsList;
	}

	public void updateByNo(BbsVo bv) throws Exception {
		ArrayList<BbsVo> bbsList = this.fileRead();
		for (int i = 0; i < bbsList.size(); i++) {
			BbsVo tempBbsVo = bbsList.get(i);
			if (tempBbsVo.getNo().equals(bv.getNo())) {
				bbsList.set(i, bv);
				break;
			}
		}
		this.fileWrite(bbsList);
	}

	public void deleteByNo(String no) throws Exception {
		ArrayList<BbsVo> bbsList = this.fileRead();
		for (int i = 0; i < bbsList.size(); i++) {
			BbsVo tempBboVo = bbsList.get(i);
			if (tempBboVo.getNo().equals(no)) {
				bbsList.remove(i);
				break;
			}
		}
		for (int i = 0; i < bbsList.size(); i++) {
			BbsVo temp = bbsList.get(i);
			temp.setNo(String.valueOf(i + 1));

		}
		this.fileWrite(bbsList);
	}

}
