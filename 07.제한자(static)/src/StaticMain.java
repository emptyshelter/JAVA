
public class StaticMain {

	public static void main(String[] args) {
		/*
		 * 정적멤버접근
		 * 	- 클래스 이름, 정적멤버이름
		 * 	- Static.static_member_field=2321;
		 */
		System.out.println("1.Static.static_member_field-->"+
							Static.static_member_field);
		Static.static_member_field=9090;
		System.out.println("1.Static.static_member_field-->"+
							Static.static_member_field);
		Static.static_method();
		
		Static st1 =new Static();
		st1.instance_memeber_field=1;
		st1.instance_method();
		
		Static st2 =new Static();
		st2.instance_memeber_field=2;
		st2.instance_method();
		
		Static st3 =new Static();
		st3.instance_memeber_field=3;
		st3.instance_method();
		
		Static st4 =new Static();
		st4.instance_memeber_field=4;
		st4.instance_method();
		
		System.out.println("==========================================");
		System.out.println(Static.static_member_field);
		System.out.println(st1.static_member_field);
		System.out.println(st2.static_member_field);
		System.out.println(st3.static_member_field);
		System.out.println(st4.static_member_field);
		//The static field Static.static_member_field should be accessed in a static way
		Static.static_method();
		st1.static_method();
		st2.static_method();
		st3.static_method();
		st4.static_method();
		//The static method static_method() from the type Static should be accessed in a static way
		


	}
	
	
	
}