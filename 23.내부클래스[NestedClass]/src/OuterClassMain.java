
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
		//�ܺο��� �ٸ� innerclass�� ȣ��(���)���� �ʴ´�.
	}

}
