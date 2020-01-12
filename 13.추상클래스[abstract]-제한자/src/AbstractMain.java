
public class AbstractMain {

	public static void main(String[] args) {
		
		//Cannot instantiate the type AbstractClass
		//AbstractClass atc = new AbstractClass();
		AbstractChild abstractChild=new AbstractChild();
		abstractChild.method1();
		abstractChild.method2();
		
		AbstractClass atc1 = abstractChild;
		atc1.method1();
		atc1.method2();
		System.out.println("---------array----------");
		AbstractClass[] acArray=new AbstractClass[3];
		acArray[0] = new AbstractChild();
		acArray[1] = new AbstractChild();
		acArray[2] = new AbstractChild();
		
		for (int i = 0; i < acArray.length; i++) {
			acArray[i].method2();
		}
		
		
		
	}

}








