
public class MeberMethod2Main {

	public static void main(String[] args) {
		System.out.println("Main");
		MemberMethod2 mm21 = new MemberMethod2();
		mm21.member1=1111;
		mm21.member2=2222;
		System.out.println("Main2");
		mm21.method1();
		System.out.println("Main3");
		mm21.method2();
		System.out.println("Main4");
		mm21.print();		
	
		MemberMethod2 mm22 = new MemberMethod2();
		mm22.method2();
		mm22.member1=8989;
		mm22.member2=7979;
		mm22.print();
		
		System.out.println("===============this=============");
		MemberMethod2 mm23 = new MemberMethod2();
		MemberMethod2 mm24 = new MemberMethod2();
		MemberMethod2 mm25 = new MemberMethod2();
		MemberMethod2 mm26 = new MemberMethod2();
		System.out.println(mm23);
		mm23.member1=23;
		mm23.member2=23;
		mm23.print();
		System.out.println(mm24);
		mm24.member1=24;
		mm24.member2=24;
		mm24.print();
		System.out.println(mm25);
		mm25.member1=25;
		mm25.member2=25;
		mm25.print();
		System.out.println(mm26);
		mm26.member1=26;
		mm26.member2=26;
		mm26.print();
		
		mm21.method3(3333, 3333);
		mm22.method3(4444, 7777);
		mm23.method3(33123, 12333);
		mm24.method3(3738393, 3435363);
		mm25.method3(3131323, 3334353);
		mm26.method3(3333, 3333);
		
		mm21.print();
		mm22.print();
		mm23.print();
		mm24.print();
		mm25.print();
		mm26.print();
		

	}

}
