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

			bbs.add(new BbsVo("1", "Ȩ�������� �����Ǿ����ϴ�.", "������", "2017.04.02 12:00:21", "�����Ͻ� �е� ȯ���մϴ�"));
			bbs.add(new BbsVo("2", "���������Դϴ�.", "������", "2017.04.03 13:32:22",
					"1. �л��� ���� ������ �л� �ǿ��� Ȯ���� �����մϴ�.\n2. �����̳� �������� �̿��� ���� �����Խ��ǿ� �ֽ��ϴ�."));
			bbs.add(new BbsVo("3", "2017�г⵵ ��1�б� ��ϱ� �߰����� �ȳ�.", "������", "2017.04.05 13:45:12",
					"2017�г⵵ ��1�б� ��ϱ� �߰����� ��ȹ�� ������ ���� �˷��帮��,�ڼ��� ������ ���� �ȳ����� �����Ͻñ� �ٶ��ϴ�."));
			bbs.add(new BbsVo("4", "��71ȸ ���� ���������� �� 2017�г⵵ ���н� �ȳ�", "������", "2017.04.06 07:04:21", "�������� �Ⱓ�� ª���� ���񼭷��� �̸� �غ��ؾ� ��"));
			bbs.add(new BbsVo("5", "2017�⵵ �к� ���Ի� �����л���Ȱ�� ���� ��û �ȳ�", "������", "2017.04.08 17:54:12", "���� ��û �Ⱓ: 2017. 4. 6(��) 10:00 ~ 4. 9(��) 18:00"));
			bbs.add(new BbsVo("6", "[������] 8�� YBM����Ư�� �����ȳ�", "������", "2017.04.10 14:22:43", "-TEPS������, ��TOEIC������, TOEIC Speaking��\n-TOEFL LC/RC������, TOEFL Speaking/Writing��"));
			
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
