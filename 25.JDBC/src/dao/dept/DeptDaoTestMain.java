package dao.dept;

public class DeptDaoTestMain {

	public static void main(String[] args) throws Exception {
		DeptDao tempDao = new DeptDaoImpl();
		int result = tempDao.insert(new Dept(0, "TESTDEPT", "KOREA"));
		System.out.println(result+"건의 데이터가 업데이트 되었습니다.");
		result = tempDao.delete(50);
		System.out.println(result+"건의 데이터가 삭제 되었습니다.");
		System.out.println(tempDao.selectByNo(20));
		
	}

}
