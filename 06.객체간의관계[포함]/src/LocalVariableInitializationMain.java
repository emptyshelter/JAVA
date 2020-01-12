
public class LocalVariableInitializationMain {

	public static void main(String[] args) {
		int a = 9;
		int b = 10;
		int t = a;
		a = b;
		b = t;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		/*
		The local variable tot may not have been initialized
		 */
		int tot;
		/*
		tot=tot+1;
		System.out.println(tot);
		if(tot>100) {
			
		}
		*/
		int a1=a;
		int b1=b;
		
		LocalVariableInitialization m1=new LocalVariableInitialization(1,"KIM");
		m1.print();
		
		LocalVariableInitialization m2=null;
		/*
		 *  null : ��ü�ּҸ��ͷ�(��)
		 *         ��ü�ּҰ��ʱ�ȭ�뵵�λ��
		 */
		if(m2==null) {
			m2=new LocalVariableInitialization(2, "LEE");
			m2.print();
		}else {
			m2.print();
		}
		
		
		LocalVariableInitialization mm1=new LocalVariableInitialization(3, "SAM");
		LocalVariableInitialization mm2=null;
		mm2=mm1;
		System.out.println(mm1);
		System.out.println(mm2);
		if(mm1==mm2) {
			System.out.println("mm1�� mm2�� �ּҰ��̵����ϴ�");
		}else {
			System.out.println("mm1�� mm2�� �ּҰ��̵��������ʴ�");
		}
		
		LocalVariableInitialization firstMember=new LocalVariableInitialization(1111,"FIRST");
		LocalVariableInitialization secondMember=new LocalVariableInitialization(2222,"SECOND");
		firstMember.print();
		secondMember.print();
		LocalVariableInitialization tempMember = firstMember;
		
		firstMember=secondMember;
		secondMember=tempMember;
		
		firstMember.print();
		secondMember.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
