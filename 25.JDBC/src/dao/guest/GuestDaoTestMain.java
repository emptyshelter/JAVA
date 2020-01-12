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
				guest.updateGuest(new Guest(3, "�츮�����!", new Date(System.currentTimeMillis()), 
											"kkh@itwill.best.kr", "182.237.126.19", "������ְ�", "�ƽ���?"));
		System.out.println(result+"���� �����Ͱ� ������Ʈ �Ǿ����ϴ�.");
		result = guest.deleteGuest(7);
		System.out.println(result+"���� �����Ͱ� ���� �Ǿ����ϴ�.");
		ArrayList<Guest> guestList = guest.selectByAll();
		for (Guest guest2 : guestList) {
			System.out.println(guest2);
		}
		int insert = guest.insertGuest(
				new Guest(0, "�׽�Ʈ�մ�", new Date(System.currentTimeMillis()), "test@test.com", "����~", "�𸥴�~", "�𸥴�~"));
		insert = guest.insertGuest(
				new Guest(0, "�׽���", new Date(System.currentTimeMillis()), "test@test.com", "����~", "�𸥴�~", "�𸥴�~"));
		insert = guest.insertGuest(
				new Guest(0, "�������¼մ�", new Date(System.currentTimeMillis()), "test@test.com", "����~", "�𸥴�~", "�𸥴�~"));
		insert = guest.insertGuest(
				new Guest(0, "����մ�", new Date(System.currentTimeMillis()), "test@test.com", "����~", "�𸥴�~", "�𸥴�~"));
		insert = guest.insertGuest(
				new Guest(0, "��...��?", new Date(System.currentTimeMillis()), "test@test.com", "����~", "�𸥴�~", "�𸥴�~"));
		
		

	}

}
