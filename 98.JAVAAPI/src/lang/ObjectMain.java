package lang;

public class ObjectMain {

	public static void main(String[] args) {
		/*
		<< Object >>
		- Class Object is the root of the class hierarchy.
		- Every class has Object as a superclass. 
		- All objects, including arrays, implement the methods of this class.
		 */
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		System.out.println("-------toString-----------");
		/*
		<< Object >>
		public String toString()
			- Returns a string representation of the object.
			- In general, the toString method returns a string 
				that "textually represents" this object. 
		    - The result should be a concise but informative representation 
		    	that is easy for a person to read. 
		    - It is recommended that all subclasses override this method.
		 */
		String str1 = o1.toString();
		System.out.println(str1);
		System.out.println(o2.toString());
		System.out.println("-----------equals----------");
		/*<< Object >>
			public boolean equals(Object obj);
			   - 주소가같은지 비교
		 */
		
		boolean isEqual = o1.equals(o2);
		System.out.println(isEqual);
		if(o3.equals(o1)) {
			System.out.println("o3와 o1의 주소가 동일하다[equals]");
		}
		if(!o1.equals(o2)) {
			System.out.println("o1와 o2의 주소가 동일하지않다[equals]");
		}
		
		if(o1==o3) {
			System.out.println("o3 == o1 의 주소가 동일하다[==]");
		}
		if(o1!=o2) {
			System.out.println("o3 != o1 의 주소가 동일하지않다[ != ]");
		}
		
		ObjectChild oc1=new ObjectChild();
		ObjectChild oc2=new ObjectChild();
		ObjectChild oc3=oc1;
		System.out.println(oc1.toString());
		System.out.println(oc2.toString());
		System.out.println(oc3.toString());
		if(!oc1.equals(oc2)) {
			System.out.println("oc1과 oc2 의 주소는 다르다[equals]");
		}
		if(oc1.equals(oc3)) {
			System.out.println("oc1과 oc3 의 주소는 같다[equals]");
			
		}
		if(oc1!=oc2) {
			System.out.println("oc1과 oc2 의 주소는 다르다[ != ]");
		}
		if(oc1==oc3) {
			System.out.println("oc1과 oc3 의 주소는 같다[ == ]");
			
		}
		
		
		
		

	}

}
