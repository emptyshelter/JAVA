package com.itwill03.����;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * ȸ����ü����
		 */
		BookMember bm11 = new BookMember(11, "�ſ��", "010-1234-6578",
						  new Book(20, "����å", "�ſ��", "����", "��̾���"));
		BookMember bm12 = new BookMember(12, "�ſ��", "010-1234-6578",null);
		BookMember bm13 = new BookMember(13, "�ſ��", "010-1234-6578",null);
		BookMember bm14 = new BookMember(14, "�ſ��", "010-1234-6578",null);
		BookMember bm15 = new BookMember(15, "�ſ��", "010-1234-6578",null);
		
		/*
		 * å��ü����
		 */
		Book bm21 = new Book(20, "����å", "�ſ��", "����", "��̾���");
		Book bm22 = new Book(21, "�̰����ڹٴ�", "java", "å", "������̾���");
		Book bm23 = new Book(22, "�������ڹٴ�", "���α׷���", "BOOK", "�׳���̾���");
		Book bm24 = new Book(23, "�װ����ڹٴ�", "����", "java", "�Ⱥ�");
		Book bm25 = new Book(24, "�ڹٴ��̰���", "�̰����ڹٴ�", "vaja", "�𸣰ڴ�");		

		/*
		 * ȸ���� å�� �뿩
		 * 
		 * å��ü���������� ȸ���� �������������
		 */
		
	
		
		/*
		 * ȸ���������(ȸ�������� ȸ���̺���å�������)
		 */
		bm11.Print();
		
		
	}
}
