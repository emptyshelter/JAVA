
public class Child2 extends Parent{
	public int member4;
	public void method4() {
		System.out.println("Child2.method4()");
	}
	public void childPrint() {
		System.out.println(this.member1+"\t"+
						   this.member2+"\t"+
						   this.member4+"\t");
	}
}
