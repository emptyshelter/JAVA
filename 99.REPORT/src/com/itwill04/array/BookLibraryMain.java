package com.itwill04.array;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * ȸ����ü����
		 */
		BookMember bm = new BookMember(2341, "�մ�1", "010-2341-4321", null);
		/*
		 * å��ü����
		 */
		Book[] books = {
				new Book(198711, "���ǿ���", "�ι���", "����~"),
				new Book(117891, "���Ƕ������ΰ�", "�ι���", "����ؿ� ����Ŭ����"),				
				new Book(201912, "�̰����ڹٴ�", "�帣�Ҽ�", "�Ҽ���������")				
		};

		/*
		 * ȸ���� å�� �뿩
		 * 
		 * å��ü���������� ȸ���� �������������
		 */
		bm.setBooks(books);
		
		
		/*
		 * ȸ���������(ȸ�������� ȸ���̺���å�������)
		 */
		bm.print();
		
	}
}
