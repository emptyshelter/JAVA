package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bm11 = new BookMember(11, "신용권", "010-1234-6578",
						  new Book(20, "제목책", "신용권", "시집", "재미없음"));
		BookMember bm12 = new BookMember(12, "신용권", "010-1234-6578",null);
		BookMember bm13 = new BookMember(13, "신용권", "010-1234-6578",null);
		BookMember bm14 = new BookMember(14, "신용권", "010-1234-6578",null);
		BookMember bm15 = new BookMember(15, "신용권", "010-1234-6578",null);
		
		/*
		 * 책객체생성
		 */
		Book bm21 = new Book(20, "제목책", "신용권", "시집", "재미없음");
		Book bm22 = new Book(21, "이것이자바다", "java", "책", "정말재미없음");
		Book bm23 = new Book(22, "저것이자바다", "프로그래밍", "BOOK", "그냥재미없음");
		Book bm24 = new Book(23, "그것이자바다", "정복", "java", "안봄");
		Book bm25 = new Book(24, "자바다이것이", "이것이자바다", "vaja", "모르겠다");		

		/*
		 * 회원이 책을 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		
	
		
		/*
		 * 회원정보출력(회원정보와 회원이빌린책정보출력)
		 */
		bm11.Print();
		
		
	}
}
