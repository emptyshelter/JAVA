package com.itwill04.array;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bm = new BookMember(2341, "손님1", "010-2341-4321", null);
		/*
		 * 책객체생성
		 */
		Book[] books = {
				new Book(198711, "사피엔스", "인문학", "샬롬~"),
				new Book(117891, "정의란무엇인가", "인문학", "사랑해요 마이클샌델"),				
				new Book(201912, "이것이자바다", "장르소설", "소설같은데요")				
		};

		/*
		 * 회원이 책을 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		bm.setBooks(books);
		
		
		/*
		 * 회원정보출력(회원정보와 회원이빌린책정보출력)
		 */
		bm.print();
		
	}
}
