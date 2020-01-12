
public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation ec = new Encapsulation();
		/*
		The field Encapsulation.member1 is not visible
		ec.member1="¹®ÀÚ¿­";
		ec.member2=123;
		ec.member3='°¡';
		ec.member4=23.456;
		ec.member5=true;
		*/
		ec.setMember1("¹®ÀÚ¿­");
		ec.setMember2(123);
		ec.setMember3('°¡');
		ec.setMember4(23.456);
		ec.setMember5(true);
		
		String m1=ec.getMember1();
		System.out.println(m1);
		System.out.println(ec.getMember2());
		System.out.println(ec.getMember3());
		System.out.println(ec.getMember4());
		System.out.println(ec.isMember5());
		
		ec.setEncapsulationData("º¯°æ¹®ÀÚ", 9999, 'ÆR', 3.14159, false);
		ec.setMember3('Ád');
		ec.print();

	}

}
