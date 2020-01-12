package com.itwill.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.itwill.vo.BbsVo;

public class BbsFreeDao {

	private ArrayList<BbsVo> bbs;

	public BbsFreeDao() throws Exception {

		File bbsFile = new File("bbsOfficial.txt");

		if (!bbsFile.exists()) {
			bbsFile.createNewFile();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(bbsFile));
			bbs = new ArrayList<BbsVo>();
			bbs.add(new BbsVo("1", "개발자로서 새로운 프로그램에 대해 공부 어떻게 하시나요?", "정대현", "2017.04.03 22:00:44", "알려주세요"));
			bbs.add(new BbsVo("2", "이클립스에서 자바 doc 파일 보는방법이?", "김성훈", "2017.03.08 22:30:32", "알려주세요"));
			bbs.add(new BbsVo("3", "안녕하세요. 김경호 교수님 질문있습니다.", "나호준", "2017.04.03 23:00:12", "자바를 잘하려면 어떻게 해야하나요?"));
			bbs.add(new BbsVo("4", "[java] 자료형 질문", "박준호", "2017.04.06 12:45:44", "문자열은 자료형이 string이고 숫자는 크기에 따라 int, long..을 쓰는데요\n이미지들은 어떤걸 사용하나요?"));
			bbs.add(new BbsVo("5", "자료구죠 공부중인데 이해가 안되서 질문좀 하겠습니다", "남민지", "2017.04.08 15:34:43", "선형리스트 A를 C 프로그램에서 2차원 배열  표현했을 때, 몇 번째 원소인가? 단, 인덱스는 0부터 시작\n이문제 정답이 11인데 어덯게 11인 나온지 모르겟습니다 설명 해주시면 감사하겠습니다 ㅠㅠ"));
			bbs.add(new BbsVo("6", "리플렉션에 대해 알고 싶습니다", "박준호", "2017.04.10 23:03:32", "참고할 만한 주소 링크 남겨주신다면 제가 직접 확인해보도록 하겠습니다"));
			bbs.add(new BbsVo("7", "c++ 질문이요!", "김성훈", "2017.04.11 06:54:22", "코드작성을 어떻게해야 오늘날짜가 출력될까요?"));
			bbs.add(new BbsVo("8", "쿼리문에서 url 호출이 가능한가요?", "정대현", "2017.04.11 09:36:57", "사용자 테이블에 이름과 id 칼럼이 있고 웹 상에 패스워드가 따로 저장되어 있습니다. \n 방법을 알고싶습니다."));
			
			

			oos.writeObject(new ArrayList<BbsVo>());
			this.fileWrite(bbs);
			oos.close();
		}
	}

	@SuppressWarnings("unchecked")
	private ArrayList<BbsVo> fileRead() throws Exception {
		File bbsFile = new File("bbsOfficial.txt");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(bbsFile));
		ArrayList<BbsVo> bbsList = (ArrayList<BbsVo>) ois.readObject();
		ois.close();
		return bbsList;

	}

	private void fileWrite(ArrayList<BbsVo> bbsList) throws Exception {
		File bbsFile = new File("bbsOfficial.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(bbsFile));
		oos.writeObject(bbsList);
		oos.close();

	}

	public void insert(BbsVo insertBbs) throws Exception {
		ArrayList<BbsVo> bbsList = this.fileRead();
		insertBbs.setNo(insertBbs.getNo());
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
