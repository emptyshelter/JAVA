package dao.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.dao.common.ConnectionFactory;

public class DeptDaoImpl implements DeptDao{
	/*
	DEPTNO	NUMBER(2,0)
	DNAME	VARCHAR2(14 BYTE)
	LOC	VARCHAR2(13 BYTE)
	 */
	@Override
	public int insert(Dept deparment) throws Exception {
		String insertSql = DeptSQL.DEPT_INSERT;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insertSql);
		pstmt.setString(1, deparment.getDname());
		pstmt.setString(2, deparment.getLoc());
		int result = pstmt.executeUpdate();
		return result;
	}
	@Override
	public int delete(int deptno) throws Exception{
		String deleteSql = DeptSQL.DEPT_DELETE;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(deleteSql);
		pstmt.setInt(1, deptno);
		int result = pstmt.executeUpdate();
		return result;
	}

	@Override
	public Dept selectByNo(int deptno) throws Exception {
		Dept dept = new Dept();
		String findSql = DeptSQL.DEPT_FIND_NO;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(findSql);
		pstmt.setInt(1, deptno);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			dept.setDeptno(rs.getInt("deptno"));
			dept.setDname(rs.getString("dname"));
			dept.setLoc(rs.getString("loc"));
		}
		return dept;
	}

	@Override
	public List selectByAll() throws Exception {
		List findAll = new ArrayList();
		Dept tempDept = new Dept();
		String findSql = DeptSQL.DEPT_FIND_ALL;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(findSql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			tempDept.setDeptno(rs.getInt("deptno"));
			tempDept.setDname(rs.getString("dname"));
			tempDept.setLoc(rs.getString("loc"));
			findAll.add(tempDept);
		}
		return findAll;
	}

	@Override
	public List selectEmployees() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
