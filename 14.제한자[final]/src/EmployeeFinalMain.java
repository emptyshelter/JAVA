
public class EmployeeFinalMain {

	public static void main(String[] args) {
		Employee[] emps = new Employee[5];
		Employee[] empArray= {
				new SalaryEmployee(1, "KIM", 30000000),
				new SalaryEmployee(2, "HIM", 35000000),
				new SalaryEmployee(3, "FIM", 11000000),
				new HourlyEmployee(5, "BIM", 100, 30000),
				new HourlyEmployee(6, "JIM", 100, 9000)
		};
		for (int i = 0; i < empArray.length; i++) {
			empArray[i].calculatePay();
			System.out.println("============"+empArray[i].getName()
					+ "���� �޿� ��ǥ ===========");
			empArray[i].print();
			double incentive=
					empArray[i].calculateIncentive();
			System.out.println("\t�μ�Ƽ��"+incentive);
		}System.out.println("------------------------------------------");
		
		
		for (Employee employee : empArray) {
			employee.calculatePay();
			System.out.println("============"+employee.getName()
					+ "���� �޿� ��ǥ ===========");
			employee.print();
			System.out.println("------------------------------------------");
		}

	}

}
