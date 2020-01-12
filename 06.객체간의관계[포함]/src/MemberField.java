
public class MemberField {
	/* 0.¸â¹öÇÊµå»ı¼º ÃÊ±âÈ­ ¾ø´Ù¸é ±âº»°ªÀÚµ¿ÃÊ1±âÈ­
	 * 1.¸â¹öÇÊµå»ı¼º ÃÊ±âÈ­
	 */
	public int member1=90;
	public double member2=0.3;
	public char member3='±è';
	public boolean member4=true;
	public LocalVariableInitialization  member5 = new LocalVariableInitialization(8888,"ÆÈÆÈ") ;
	public Account member6 = new Account(3432,"KIM",9,0.1);
	
	public MemberField() {
		/*
		 * 2.»ı¼ºÀÚ ÃÊ±âÈ­
		 */
		this.member1=99999;
		this.member2=0.01;
		this.member3='ÆR';
		this.member4=false;
		this.member5 = new LocalVariableInitialization(111, "ÀÏÀÏ");
		this.member6=new Account(23132, "SONG", 900000, 3.8);
	}
}
