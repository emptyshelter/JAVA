
public class MemberField {
	/* 0.����ʵ���� �ʱ�ȭ ���ٸ� �⺻���ڵ���1��ȭ
	 * 1.����ʵ���� �ʱ�ȭ
	 */
	public int member1=90;
	public double member2=0.3;
	public char member3='��';
	public boolean member4=true;
	public LocalVariableInitialization  member5 = new LocalVariableInitialization(8888,"����") ;
	public Account member6 = new Account(3432,"KIM",9,0.1);
	
	public MemberField() {
		/*
		 * 2.������ �ʱ�ȭ
		 */
		this.member1=99999;
		this.member2=0.01;
		this.member3='�R';
		this.member4=false;
		this.member5 = new LocalVariableInitialization(111, "����");
		this.member6=new Account(23132, "SONG", 900000, 3.8);
	}
}
