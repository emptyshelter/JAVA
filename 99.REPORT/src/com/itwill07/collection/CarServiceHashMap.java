package com.itwill07.collection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sun.javafx.util.TempState;

public class CarServiceHashMap {
	private HashMap <String, Car> carMap;
	private int count;// ������ ��ȹ��

	public CarServiceHashMap() {
		carMap = new HashMap<String, Car>();
		count = 10;
	}

	public CarServiceHashMap(int count) {
		carMap = new HashMap<String, Car>();
		this.count = count;
	}

	/*
	 * 0. ����ü���ڷι޾Ƽ� ������ �������п��ι�ȯ - �������� �����̸� ��������
	 */
	public boolean ipCha(Car inCar) {
		boolean isSuccess = false;
		if (carMap.size() <count) {
			carMap.put(inCar.getNo(), inCar);
			isSuccess=true;
		}
		return isSuccess;
	}

	/*
	 * 1. ��ü�������(X)
	 */
	public void print() {
		HashMap<String, Car>findCar = new HashMap<String, Car>();
		Iterator<String>carIter =carMap.keySet().iterator();
		while (carIter.hasNext()) {
			String tempKey = carIter.next();
			Car tempCar= carMap.get(tempKey);
			tempCar.print();
		}
		return;
	}

	/*
	 * 5. ������ȣ(4567��) ���ڹ޾Ƽ� ����ü�Ѵ� ����������ȯ
	 */
	public Car findByNo(String no) {
		Car findCar =null;
		if (carMap.containsKey(no)) {
			findCar= carMap.get(no);
		}else {
			System.out.println(no+"�� ������ Ȯ�ε��� �ʽ��ϴ�.");
		}
		return findCar;
	}

	/*
	 * 6. �����ð�(8������)���ڹ޾Ƽ� ArrayList(����ü�迭) ����������ȯ(X)
	 */
	public ArrayList<Car>  findByInTime(int inTime) {
		ArrayList <Car> findCars = new ArrayList<Car>();
		Iterator <String>carIter = carMap.keySet().iterator();		 
		while (carIter.hasNext()) {
			String tempKey = (String) carIter.next();
			Car tempCar = carMap.get(tempKey);
			if (tempCar.getInTime() > inTime) {
				findCars.add(tempCar);
			}
		}
		return findCars;
	}

	/*
	 * 7. ������ȣ(7891��),�����ð�(12��)���ڷ� �޾Ƽ� ����");
	 */
	public Car chulCha(String no, int outTime) {
		Car removeCar= null;
		for (int i = 0; i < carMap.size(); i++) {
			if (carMap.containsKey(no)) {
				removeCar=(Car)carMap.get(no);
				removeCar.setOutTime(outTime);
				removeCar.calculateFee();
				removeCar=(Car)carMap.remove(no);
				break;
			}
		}
		return removeCar;
	}
	/*
	 * 2. ������ü��ȹ����ȯ 
	 */
	public int getParkingLotCount() {
		return this.count;
	}
	
	/*
	  3. ��������������ȹ����ȯ 
	 */
	public int getAvailableParkingLotCount() {
		return count-carMap.size();
	} 
	
}