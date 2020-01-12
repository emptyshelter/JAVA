
public class OverloadingMain {

	public static void main(String[] args) {
		Overloading overloading=new Overloading();
		overloading.method();
		overloading.method(123);
		overloading.method("메시지");
		overloading.method("메세지",123);
		overloading.method(19,87);
		Calculator calculator= new Calculator();
		System.out.println(calculator.add(1, 2));
		System.out.println(calculator.add(1, 2, 3));
		System.out.println(calculator.add(1, 2, 3, 4));		
	}

}
