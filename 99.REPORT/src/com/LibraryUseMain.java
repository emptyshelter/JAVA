package com;

import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;

public class LibraryUseMain {
	public static void main(String[] args) {
		ShopService service = new ShopService();
		Member m =new Member();
		System.out.println(service);
		System.out.println(m);
		
	}

}
