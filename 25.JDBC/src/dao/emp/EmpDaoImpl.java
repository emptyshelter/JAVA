package dao.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.itwill.dao.common.ConnectionFactory;

public class EmpDaoImpl implements EmpDao {

	@Override
	public int insert(Emp emp) throws Exception {
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(EmpSQL.EMP_INSERT);
		pstmt.setString(1, emp.getEname());
		pstmt.setString(2, emp.getJob());
		pstmt.setInt(3, emp.getMgr());
		pstmt.setDouble(4, emp.getSal());
		pstmt.setDouble(5, emp.getComm());
		pstmt.setInt(6, emp.getDeptno());
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int update(Emp emp) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(EmpSQL.EMP_UPDATE);
		pstmt.setString(1, emp.getEname());
		pstmt.setString(2, emp.getJob());
		pstmt.setInt(3, emp.getMgr());
		pstmt.setDouble(4, emp.getSal());
		pstmt.setDouble(5, emp.getComm());
		pstmt.setInt(6, emp.getEmpno());
		int result = pstmt.executeUpdate();
		
		return result;
	}

	@Override
	public int delete(int empno) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(EmpSQL.EMP_DELETE);
		pstmt.setInt(1, empno);
		int result = pstmt.executeUpdate();
		return result;
	}

	@Override
	public Emp findByEmpno(int empno) throws Exception {
		Emp findNo = null;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(EmpSQL.EMP_FIND_EMPNO);
		pstmt.setInt(1, empno);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			findNo= new Emp(rs.getInt("empno"), rs.getString("ename"), rs.getString("job"), 
							rs.getInt("mgr"), rs.getDate("hiredate"), rs.getDouble("sal"), 
							rs.getDouble("comm"), rs.getInt("deptno"));
		}
		return findNo;
	}
	
	@Override
	public List<Emp> findByDeptno(int deptno) throws Exception {
		List<Emp> findDeptNo = new ArrayList<Emp>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(EmpSQL.EMP_FIND_DEPTNO);
		pstmt.setInt(1, deptno);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Emp tempEmp= new Emp(rs.getInt("empno"), rs.getString("ename"), rs.getString("job"), 
								 rs.getInt("mgr"), rs.getDate("hiredate"), rs.getDouble("sal"), 
								 rs.getDouble("comm"), rs.getInt("deptno"));
			findDeptNo.add(tempEmp);
		}
		return findDeptNo;
	}
	// 사원정보(부서정보포함) 한개 반환
	@Override
	public HashMap findEmpnoWithDept(int no) throws Exception {
		HashMap rowMap=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		
		con=ConnectionFactory.getConnection();
		pstmt=con.prepareStatement(EmpSQL.SELECT_EMPNO_WITHDEPT);
		pstmt.setInt(1,no);
		rs=pstmt.executeQuery();
		if(rs.next()) {
			rowMap=new HashMap();
			rowMap.put("empno", rs.getInt("empno"));
			rowMap.put("ename", rs.getString("ename"));
			rowMap.put("job", rs.getString("job"));
			rowMap.put("sal", rs.getDouble("sal"));
			rowMap.put("deptno", rs.getInt("deptno"));
	
			rowMap.put("dname", rs.getString("dname"));
			rowMap.put("loc", rs.getString("loc"));
		}
		
		return rowMap;
	}
	//사원정보(부서정보포함) 전체목록 반환
	@Override
	public ArrayList<HashMap> findEmpsWithDept() throws Exception {
		ArrayList<HashMap> empList = new ArrayList<HashMap>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		con = ConnectionFactory.getConnection();
		pstmt = con.prepareStatement(EmpSQL.SELECT_ALLEMP_WITHDEPT);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			HashMap rowMap = new HashMap();
			rowMap.put("empno", rs.getInt("empno"));
			rowMap.put("ename", rs.getString("ename"));
			rowMap.put("job", rs.getString("job"));
			rowMap.put("sal", rs.getDouble("sal"));
			rowMap.put("deptno", rs.getInt("deptno"));
	
			rowMap.put("dname", rs.getString("dname"));
			rowMap.put("loc", rs.getString("loc"));
			empList.add(rowMap);
		}
		
		return empList;
	}

	

}
