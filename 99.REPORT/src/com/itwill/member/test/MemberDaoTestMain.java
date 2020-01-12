package com.itwill.member.test;

import java.util.ArrayList;

import com.itwill.member.Member;
import com.itwill.member.MemberDao;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception{
		MemberDao memberDao=new MemberDao();
		System.out.println("-----------------create------------");
		if(!memberDao.isDuplicateId("a")) {
			memberDao.create(
					new Member( "a", "a", "¿¡ÀÌ¿¡ÀÌ", "°æ±âµµ¹Î", 34, true));
		}

		if(!memberDao.isDuplicateId("b")) {
		memberDao.create(
				new Member( "b", "b", "ºñºñºñºñ", "¼­¿ï½Ã¹Î", 43, true));
		}
		if(!memberDao.isDuplicateId("c")) {
			memberDao.create(
				new Member("c", "c", "¾¾¾¾¾¾¾¾", "ºÎ»ê½Ã¹Î", 29, false));
		}	
		System.out.println("-----------------readOne------------");
		System.out.println(memberDao.readOne("a"));
		System.out.println("-----------------update------------");
		memberDao.update(new Member( "a", "a", "¿¡ÀÌ¼öÁ¤","°æ±âµµ¹Î", 34, true));
		System.out.println("-----------------readAll------------");
		ArrayList<Member> memberList=memberDao.readAll();
		System.out.println(memberList);
		System.out.println("-----------------delete------------");
		memberDao.delete("a");
		System.out.println("-----------------readAll------------");
	    memberList=memberDao.readAll();
		System.out.println(memberList);
	}

}
