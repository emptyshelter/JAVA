/*
      package 
      1. �����ִ�(����) Ŭ������ ����(��Ű��)
      2. ��Ű���� �̸��� ���������� ū�����������������α���  
      3. Ŭ������ �������̸��� ��Ű���� �������̸��̴�.
      4. �̸��浹�� ���ϱ����ؼ� 
     ex> package samson.sds.chongmu;
	     public class Chongmu1{
		 
		 }
       
	  4.compile ��� 
			>javac -d . XXX.java  	
*/
public class PackageMain {
	public static void main(String[] args) {
		com.itwill.shop.member.Member m1=
				new com.itwill.shop.member.Member();
		System.out.println(m1);
		com.itwill.shop.member.MemberService memberService=
				new com.itwill.shop.member.MemberService();
		System.out.println(memberService);
		
		com.itwill.shop.admin.Member am1=
				new com.itwill.shop.admin.Member();
		System.out.println(am1);		
		
		com.itwill.shop.ShopService shopService=
				new com.itwill.shop.ShopService();
		System.out.println(shopService);
		com.itwill.shop.order.Order order=
				new com.itwill.shop.order.Order();
	}

}
