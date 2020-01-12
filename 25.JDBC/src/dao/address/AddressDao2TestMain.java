package dao.address;

import java.util.ArrayList;

public class AddressDao2TestMain {

	public static void main(String[] args) throws Exception {
		AddressDao2 addressDao2= new AddressDao2();
		int result = addressDao2.insert("aaa","�������","2341-31123","���");
		result = addressDao2.insert(new Address(0, "kkkk", "����Ƽ", "333-3434", "����ù�"));
		Address updateAddress = new Address(31, "guard", "�躯��", "333-2341", "���ù�");
		result = addressDao2.update(updateAddress);
//		result = addressDao2.delete(9);
		Address address=addressDao2.selectByPk(29);
		System.out.println(address);
		address=addressDao2.selectByPk(30);
		System.out.println(address);
		address=addressDao2.selectByPk(31);
		System.out.println(address);
		ArrayList<Address> addressList= addressDao2.selectAll();
		for (Address address2 : addressList) {
			System.out.println(address2);
		}
	}

}