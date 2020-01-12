package dao.guest;

import java.util.ArrayList;
import java.util.Date;

public class GuestDaoTestMain {

	public static void main(String[] args) throws Exception {
		GuestDaoImpl guest = new GuestDaoImpl();
		Guest findguest = new Guest();
		findguest = guest.selectByNo(2);
		System.out.println(findguest);
		int result = 
				guest.updateGuest(new Guest(3, "우리강사님!", new Date(System.currentTimeMillis()), 
											"kkh@itwill.best.kr", "182.237.126.19", "강사님최고", "아시죠?"));
		System.out.println(result+"건의 데이터가 업데이트 되었습니다.");
		result = guest.deleteGuest(7);
		System.out.println(result+"건의 데이터가 삭제 되었습니다.");
		ArrayList<Guest> guestList = guest.selectByAll();
		for (Guest guest2 : guestList) {
			System.out.println(guest2);
		}
		int insert = guest.insertGuest(
				new Guest(0, "테스트손님", new Date(System.currentTimeMillis()), "test@test.com", "없당~", "모른당~", "모른당~"));
		insert = guest.insertGuest(
				new Guest(0, "테스투", new Date(System.currentTimeMillis()), "test@test.com", "없당~", "모른당~", "모른당~"));
		insert = guest.insertGuest(
				new Guest(0, "지나가는손님", new Date(System.currentTimeMillis()), "test@test.com", "없당~", "모른당~", "모른당~"));
		insert = guest.insertGuest(
				new Guest(0, "진상손님", new Date(System.currentTimeMillis()), "test@test.com", "없당~", "모른당~", "모른당~"));
		insert = guest.insertGuest(
				new Guest(0, "손...님?", new Date(System.currentTimeMillis()), "test@test.com", "없당~", "모른당~", "모른당~"));
		
		

	}

}
