package com.itwill04.array;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * ȸ����ü����
		 */
		//GeneralMember m1=new GeneralMember(1,"KIM","123-4567",null);
		DvdMember dm = new DvdMember(4321, "�մ�", "010-0000-1111", null);
		/*
		 * Dvd��ü�����
		 */
		//Dvd dvd1=new Dvd(123,"��ȭ1","����");
		//Dvd dvd2=new Dvd(345,"��ȭ2","����");
		Dvd [] dvds = {
				new Dvd(123, "����v���", "���"),
				new Dvd(321, "���̸�����", "������"),
				new Dvd(456, "�ܿ�ձ�2", "�ִϸ��̼�"),
				new Dvd(678, "�길��", "�׼�")				
		};
				
		/*
		 * ȸ����Dvd���� �뿩
		 * 
		 * Dvd�迭��ü���������� ȸ���� �������������
		 */
		dm.setDvd(dvds);
		
		
		/*
		 * ȸ���������(ȸ���̺���Dvd���������)
		 */
		//m1.print();
		dm.print();
		
	}

}
