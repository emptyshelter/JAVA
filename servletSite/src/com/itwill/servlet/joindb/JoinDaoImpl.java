package com.itwill.servlet.joindb;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JoinDaoImpl implements JoinDao{

	@Override
	public int insert(Join join) throws Exception {
		String insert = JoinSQL.INSERT;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insert);
		pstmt.setString(1, join.getId());
		pstmt.setString(2, join.getName());
		pstmt.setString(3, join.getJob());
		pstmt.setString(4, join.getAddress());
		pstmt.setString(5, join.getGender());
		int result = pstmt.executeUpdate();
		
		return result;
	}

}
