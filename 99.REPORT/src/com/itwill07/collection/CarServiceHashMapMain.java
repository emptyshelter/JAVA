package com.itwill07.collection;


import java.util.ArrayList;

public class CarServiceHashMapMain {

	public static void main(String[] args) {
		
		CarServiceHashMap carService=new CarServiceHashMap(50);
		
		System.out.println("0.CarService��ü�� ����ü���ڷ��ٲ� ����������");
		Car c1 = new Car("2344",3 );
		boolean isSuccess = carService.ipCha(c1);
		if(!isSuccess) {
			System.out.println("���� ����!!!");
		}
		carService.ipCha(new Car("4566",4 ));
		carService.ipCha(new Car("4567",5 ));
		carService.ipCha(new Car("3321",6 ));
		carService.ipCha(new Car("3908",7 ));
		carService.ipCha(new Car("7891",8 ));
		carService.ipCha(new Car("3433",9 ));
		
		System.out.println("1.CarService��ü�� ��ü�����������");
		carService.print();
		System.out.println("2.CarService��ü�� ��ü������ȹ����ȯ����");
		System.out.println(carService.getParkingLotCount());
		System.out.println("3.CarService��ü�� ��������������ȹ����ȯ����");
		System.out.println(carService.getAvailableParkingLotCount());
		System.out.println("4.CarService��ü�� ����ü���ڷ��ٲ� ����������");
		carService.ipCha(new Car("9090", 19));
		carService.print();
		System.out.println(
				"5.CarService��ü�� ������ȣ(4567��) ���ڷ��ٲ�  ����ü�Ѵ� ����������ȯ����");
		Car findCar = carService.findByNo("4567");
		findCar.print();
		System.out.println(
				"6.CarService��ü�� �����ð�(8������) ���ڷ��ٲ� ����ü�迭 ����������ȯ����");
		ArrayList findCars=carService.findByInTime(8);
		System.out.println("7.CarService��ü�� ������ȣ(7891��) �����ð�(12��)���ڷ��ٲ� ����������");
		Car removeCar = carService.chulCha("7891",12);
		removeCar.print();
		System.out.println("--------- ��ü������� --------------");
		carService.print();

	}

}
