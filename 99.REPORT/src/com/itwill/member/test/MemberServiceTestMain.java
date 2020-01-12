package com.itwill.member.test;

import com.itwill.member.Member;
import com.itwill.member.MemberService;

public class MemberServiceTestMain {

	public static void main(String[] args) throws Exception{
		MemberService memberService=new MemberService();
		System.out.println("----------memberRegister---------");
		memberService.memberRegister(
				new Member( "c", "c", "씨씨씨씨", "부산시민", 21, false));
		memberService.memberRegister(
				new Member( "d", "d", "디디디디", "경주시민", 37, false));
		memberService.memberRegister(
				new Member( "a", "a", "더블에이", "부산시민", 24, false));
		memberService.memberRegister(
				new Member( "b", "b", "비비비비", "부산시민", 56, false));
		memberService.memberRegister(
				new Member( "f", "f", "에프킬러", "부산시민", 34, false));
		memberService.memberRegister(
				new Member( "g", "g", "미키마우스", "미국시민", 121, false));
		memberService.memberRegister(
				new Member( "h", "h", "하이서울", "부산시민", 150, false));
		memberService.memberRegister(
				new Member( "i", "i", "어른아이", "부산시민", 34, false));
		
		boolean success = memberService.memberRegister(
				new Member( "e", "e", "이이이이", "부산시민", 45, true));
		System.out.println("1.성공:"+success);
		System.out.println("----------findMemberByAll---------");
		System.out.println(memberService.findMemberByAll());
		System.out.println("----------findById---------");
		System.out.println(memberService.findById("e"));
		System.out.println(memberService.findById("b"));
		System.out.println(memberService.findMemberByName("미키마우스"));
		System.out.println(memberService.findMemberByAdress("부산시민"));
		System.out.println(memberService.findMemberByAge(21));
		System.out.println("----------login---------");
		System.out.println(memberService.login("a", "a"));
		System.out.println(memberService.login("a", "111"));
		System.out.println(memberService.login("aa", "111"));
		
		
	}

}









