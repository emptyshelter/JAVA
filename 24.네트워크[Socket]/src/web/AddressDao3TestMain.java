package web;

import java.util.ArrayList;

public class AddressDao3TestMain {

	public static void main(String[] args) throws Exception {
		AddressDao3 addressDao3= new AddressDao3();
		int result = addressDao3.insert("aaa","�������","2341-31123","���");
		result = addressDao3.insert(new Address(0, "kkkk", "����Ƽ", "333-3434", "����ù�"));
		Address updateAddress = new Address(31, "guard", "�躯��", "333-2341", "���ù�");
		result = addressDao3.update(updateAddress);
//		result = addressDao2.delete(9);
		Address address=addressDao3.selectByPk(29);
		System.out.println(address);
		address=addressDao3.selectByPk(30);
		System.out.println(address);
		address=addressDao3.selectByPk(31);
		System.out.println(address);
		ArrayList<Address> addressList= addressDao3.selectAll();
		for (Address address2 : addressList) {
			System.out.println(address2);
		}
	}

}
