
public class MemberMethod3Main {

	public static void main(String[] args) {
		System.out.println("main1");
		MemberMethod3 mm1 = new MemberMethod3();
		System.out.println("main2");
		mm1.method1();
		System.out.println("main3");
		int result = mm1.method2();
		System.out.println("main4 result: "+result);
		int addResult=mm1.add(232132, 543243);
		System.out.println("maint5 addResult:"+addResult);

	}

}
