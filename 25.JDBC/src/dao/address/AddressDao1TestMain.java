package dao.address;

public class AddressDao1TestMain {

	public static void main(String[] args) throws Exception {
		AddressDao1 addressdao1= new AddressDao1();
		addressdao1.insert();
		addressdao1.update();
		addressdao1.delete();
		addressdao1.selectByPk();
		addressdao1.selectAll();
		

	}

}
