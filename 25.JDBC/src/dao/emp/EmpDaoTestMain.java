package dao.emp;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDaoTestMain {

	public static void main(String[] args)throws Exception {
		EmpDao empDao=new EmpDaoImpl();
		ArrayList<HashMap> empList=empDao.findEmpsWithDept();
		System.out.println("--------empdept list--------");
		for (Map rowMap : empList) {
			int empno=(Integer)rowMap.get("empno");
			String ename=(String)rowMap.get("ename");
			String job=(String)rowMap.get("job");
			double sal=(Double)rowMap.get("sal");
			String dname=(String)rowMap.get("dname");
			String loc=(String)rowMap.get("loc");
			System.out.println(empno+"\t"+ename+"\t"+job+"\t"+sal+"\t"+dname+"\t"+loc);
		}
		System.out.println("--------empdept one--------");
		HashMap rowMap = empDao.findEmpnoWithDept(7499);
		int empno=(Integer)rowMap.get("empno");
		String ename=(String)rowMap.get("ename");
		String job=(String)rowMap.get("job");
		double sal=(Double)rowMap.get("sal");
		String dname=(String)rowMap.get("dname");
		String loc=(String)rowMap.get("loc");
		System.out.println(empno+"\t"+ename+"\t"+job+"\t"+sal+"\t"+dname+"\t"+loc);
		int insert =
		empDao.insert(new Emp(0, "test1", "MASTER", 7698, new Date(System.currentTimeMillis()), 800, 0.2, 10));
		System.out.println(insert+"건의 데이터가 입력 되었습니다.");
		insert = empDao.update(new Emp(2, "test3", "nojob", 7902, new Date(System.currentTimeMillis()), 1000, 4, 20));
		System.out.println(insert+"건의 데이터가 업데이트 되었습니다.");
		insert = empDao.delete(3);
		System.out.println(insert+"건의 데이터가 삭제되었습니다.");
		Emp emp = new Emp();
		emp = empDao.findByEmpno(1234);
		System.out.println(emp);
		List<Emp>findDeptNo = empDao.findByDeptno(20);
		for (Emp emp2 : findDeptNo) {
			System.out.println(emp2);
		} 
	
	}

}
