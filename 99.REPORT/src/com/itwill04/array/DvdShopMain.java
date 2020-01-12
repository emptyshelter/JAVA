package com.itwill04.array;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		//GeneralMember m1=new GeneralMember(1,"KIM","123-4567",null);
		DvdMember dm = new DvdMember(4321, "손님", "010-0000-1111", null);
		/*
		 * Dvd객체들생성
		 */
		//Dvd dvd1=new Dvd(123,"영화1","전쟁");
		//Dvd dvd2=new Dvd(345,"영화2","전쟁");
		Dvd [] dvds = {
				new Dvd(123, "포드v페라리", "드라마"),
				new Dvd(321, "아이리쉬맨", "스릴러"),
				new Dvd(456, "겨울왕국2", "애니메이션"),
				new Dvd(678, "쥬만지", "액션")				
		};
				
		/*
		 * 회원이Dvd들을 대여
		 * 
		 * Dvd배열객체참조변수를 회원의 멤버변수에대입
		 */
		dm.setDvd(dvds);
		
		
		/*
		 * 회원정보출력(회원이빌린Dvd들정보출력)
		 */
		//m1.print();
		dm.print();
		
	}

}
