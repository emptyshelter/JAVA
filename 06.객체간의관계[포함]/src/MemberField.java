
public class MemberField {
	/* 0.멤버필드생성 초기화 없다면 기본값자동초1기화
	 * 1.멤버필드생성 초기화
	 */
	public int member1=90;
	public double member2=0.3;
	public char member3='김';
	public boolean member4=true;
	public LocalVariableInitialization  member5 = new LocalVariableInitialization(8888,"팔팔") ;
	public Account member6 = new Account(3432,"KIM",9,0.1);
	
	public MemberField() {
		/*
		 * 2.생성자 초기화
		 */
		this.member1=99999;
		this.member2=0.01;
		this.member3='힣';
		this.member4=false;
		this.member5 = new LocalVariableInitialization(111, "일일");
		this.member6=new Account(23132, "SONG", 900000, 3.8);
	}
}
