
public class OuterClassMain {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.outter_member_field=9090;
		oc.outter_member_method();
		/*
		OutterClass.InnerClass ic = oc.new InnerClass();
		ic.inner_member_field=3443;
		ic.inner_member_method();
		*/
		//외부에서 다른 innerclass를 호출(사용)하지 않는다.
	}

}
