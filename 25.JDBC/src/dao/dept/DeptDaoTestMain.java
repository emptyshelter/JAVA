package dao.dept;

public class DeptDaoTestMain {

	public static void main(String[] args) throws Exception {
		DeptDao tempDao = new DeptDaoImpl();
		int result = tempDao.insert(new Dept(0, "TESTDEPT", "KOREA"));
		System.out.println(result+"���� �����Ͱ� ������Ʈ �Ǿ����ϴ�.");
		result = tempDao.delete(50);
		System.out.println(result+"���� �����Ͱ� ���� �Ǿ����ϴ�.");
		System.out.println(tempDao.selectByNo(20));
		
	}

}
