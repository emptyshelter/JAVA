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
			bbs.add(new BbsVo("1", "�����ڷμ� ���ο� ���α׷��� ���� ���� ��� �Ͻó���?", "������", "2017.04.03 22:00:44", "�˷��ּ���"));
			bbs.add(new BbsVo("2", "��Ŭ�������� �ڹ� doc ���� ���¹����?", "�輺��", "2017.03.08 22:30:32", "�˷��ּ���"));
			bbs.add(new BbsVo("3", "�ȳ��ϼ���. ���ȣ ������ �����ֽ��ϴ�.", "��ȣ��", "2017.04.03 23:00:12", "�ڹٸ� ���Ϸ��� ��� �ؾ��ϳ���?"));
			bbs.add(new BbsVo("4", "[java] �ڷ��� ����", "����ȣ", "2017.04.06 12:45:44", "���ڿ��� �ڷ����� string�̰� ���ڴ� ũ�⿡ ���� int, long..�� ���µ���\n�̹������� ��� ����ϳ���?"));
			bbs.add(new BbsVo("5", "�ڷᱸ�� �������ε� ���ذ� �ȵǼ� ������ �ϰڽ��ϴ�", "������", "2017.04.08 15:34:43", "��������Ʈ A�� C ���α׷����� 2���� �迭  ǥ������ ��, �� ��° �����ΰ�? ��, �ε����� 0���� ����\n�̹��� ������ 11�ε� ��F�� 11�� ������ �𸣰ٽ��ϴ� ���� ���ֽø� �����ϰڽ��ϴ� �Ф�"));
			bbs.add(new BbsVo("6", "���÷��ǿ� ���� �˰� �ͽ��ϴ�", "����ȣ", "2017.04.10 23:03:32", "������ ���� �ּ� ��ũ �����ֽŴٸ� ���� ���� Ȯ���غ����� �ϰڽ��ϴ�"));
			bbs.add(new BbsVo("7", "c++ �����̿�!", "�輺��", "2017.04.11 06:54:22", "�ڵ��ۼ��� ����ؾ� ���ó�¥�� ��µɱ��?"));
			bbs.add(new BbsVo("8", "���������� url ȣ���� �����Ѱ���?", "������", "2017.04.11 09:36:57", "����� ���̺� �̸��� id Į���� �ְ� �� �� �н����尡 ���� ����Ǿ� �ֽ��ϴ�. \n ����� �˰�ͽ��ϴ�."));
			
			

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
