package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionMapUseMain {

	public static void main(String[] args) {
		ArrayList<ArrayList<Student>>studentList = new ArrayList<ArrayList<Student>>();
		studentList.add(new ArrayList<Student>());
		studentList.add(new ArrayList<Student>());
		studentList.add(new ArrayList<Student>());
		System.out.println("��ü���Ǽ�:"+studentList.size());
		studentList.get(0).add(new Student(1, "KIM",30,90,93));
		studentList.get(0).add(new Student(2, "LIM",80,70,41));
		studentList.get(0).add(new Student(3, "GIM",69,75,42));

		studentList.get(1).add(new Student(1, "SIM",33,45,93));
		studentList.get(1).add(new Student(2, "BIM",34,85,83));
		studentList.get(1).add(new Student(3, "HIM",29,95,41));
	
		studentList.get(2).add(new Student(1, "QIM",63,45,93));
		studentList.get(2).add(new Student(2, "WIM",94,75,98));
		studentList.get(2).add(new Student(3, "EIM",77,66,91));
		System.out.println(studentList);
		System.out.println("-------1���л���ü ���------");
		System.out.println("1 �� �л� ��ü:"+studentList.get(0));
		ArrayList<Student>firstClassStudentList = studentList.get(0);
		for (int i = 0; i < studentList.get(0).size(); i++) {
			firstClassStudentList.get(i).print();
		}
		System.out.println("-------�л� ��ü ���------");
		for (int i = 0; i < studentList.size(); i++) {
			ArrayList<Student>tempBanStudentList = studentList.get(i);
			System.out.println("--------"+(i+1)+"�� --------");
			for (int j = 0; j < tempBanStudentList.size(); j++) {
				tempBanStudentList.get(j).print();
			}
		}
		System.out.println("----------------------------------");
		HashMap<String, HashMap<String, Car>> parkingMap = 
				new HashMap<String, HashMap<String, Car>>();
		parkingMap.put("�ڳ���", new HashMap<String, Car>());
		parkingMap.put("����", new HashMap<String, Car>());
		parkingMap.put("����", new HashMap<String, Car>());
		System.out.println("---------����----------");
		parkingMap.get("�ڳ���").put("2341", new Car("2341", 1));
		parkingMap.get("�ڳ���").put("3119", new Car("3119", 3));
		parkingMap.get("����").put("7889", new Car("7889", 6));
		parkingMap.get("����").put("4658", new Car("4568", 8));
		parkingMap.get("����").put("7990", new Car("7990", 8));
		System.out.println(parkingMap);
		System.out.println("--------------get--------------");
		Car getCar =parkingMap.get("����").get("7889"); 
		getCar.print();
		Car removeCar= parkingMap.get("�ڳ���").remove("2341");
		removeCar.chulCha(18);
		System.out.println("--------------Iteration--------------");
		Iterator<String> parkNameIter=parkingMap.keySet().iterator();
		while (parkNameIter.hasNext()) {
			String parkNameStr = parkNameIter.next();
			System.out.println(parkNameStr+ " ������");
			HashMap<String, Car>carMap=
					parkingMap.get(parkNameStr);
			Iterator<String> carNoIter = carMap.keySet().iterator();
			while (carNoIter.hasNext()) {
				String carNoStr = carNoIter.next();
				Car car = carMap.get(carNoStr);
				car.print();
			}
		}
	}

}
