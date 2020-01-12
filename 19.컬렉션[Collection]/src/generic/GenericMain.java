package generic;

public class GenericMain {

	public static void main(String[] args) {
		System.out.println("***************NoGeneric*****************");
		NoGenericClass noGenericClass=new NoGenericClass();
		noGenericClass.setMember(new Account(1,"KIM",89000,3.9));
		Account getAccount = (Account)noGenericClass.getMember();
		getAccount.print();
		System.out.println("*****************Generic***************");
		GenericClass<Account> genericClass=
				new GenericClass<Account>();
		genericClass.setMember(new Account(2,"LEE",56000,0.3));
		//genericClass.setMember(new Car("3333", 12));
		//The method setMember(Account) in the type GenericClass<Account> is not applicable 
		//for the arguments (Car)
		getAccount= genericClass.getMember();
		getAccount.print();
		GenericClass<Car> genericClass2= new GenericClass<Car>();
		genericClass2.setMember(new Car("1111", 12));
		Car getCar = genericClass2.getMember();
		getCar.print();
	}

}
