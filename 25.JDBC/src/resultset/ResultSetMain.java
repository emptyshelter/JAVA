package resultset;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itwill.dao.common.ConnectionFactory;

public class ResultSetMain {

	public static void main(String[] args) throws Exception {
		/*
		 �̸�         ��?       ����            
		---------- -------- ------------- 
		NO         NOT NULL NUMBER(7)     
		NAME                VARCHAR2(50)  
		SHORT_DESC          VARCHAR2(255) 
		PRICE               NUMBER(10,3)  
		IPGO_DATE           DATE    
		 */
		String selectSql = "select no, name, short_desc, price, ipgo_date from s_product";
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		ResultSet rs = pstmt.executeQuery();
		
		boolean isExist = rs.next();//null ���� �� �� ����. nullüũ ���� ����
		System.out.println("---------------rs.getxxx(�÷� �̸�)------------------");
		if (isExist) {
			do {
				int no = rs.getInt("NO");
				String name = rs.getString("NAME");
				String desc = rs.getString("SHORT_DESC");
				double price = rs.getDouble("PRICE");
				Date ipgo_date = rs.getDate("IPGO_DATE");
				System.out.println(no+"\t"+name+"\t"+desc+"\t"+price+"\t"+ipgo_date);
			}while(rs.next());
		}else {
			System.out.println("��ǰ�� �������� �ʽ��ϴ�.");
		}
		rs.close();
		rs = pstmt.executeQuery();
		System.out.println("---------------rs.getxxx(�÷� INDEX)------------------");
		while (rs.next()) {
			int no=rs.getInt(1);
			String name = rs.getString(2);
			String desc = rs.getString(3);
			double price=rs.getDouble(4);
			Date ipgo_date=rs.getDate(5);
			System.out.println(no+"\t"+name+"\t"+desc+"\t"+price+"\t"+ipgo_date);
		}
		rs.close();
		rs = pstmt.executeQuery();
		System.out.println("---------------rs.getObject(�÷��̸�)-------------");
		while (rs.next()) {
			Object no=rs.getObject(1);
			Object name = rs.getObject(2);
			Object desc = rs.getObject(3);
			Object price=rs.getObject(4);
			Object ipgo_date=rs.getObject(5);
			System.out.println(no+"\t"+name+"\t"+desc+"\t"+price+"\t"+ipgo_date);
		}
		rs.close();
		rs = pstmt.executeQuery();
		System.out.println("---------------rs.getString(�÷��̸�)-------------");
		while (rs.next()) {
			String no=rs.getString("no");
			String name = rs.getString("name");
			String desc = rs.getString("short_desc");
			String price=rs.getString("price");
			String ipgo_date=rs.getString("ipgo_date");
			System.out.println(no+"\t"+name+"\t"+desc+"\t"+price+"\t"+ipgo_date);
		}
		rs.close();
		
		
		
		
//		String insertSql = "insert into s_product values(10025,'��Ʈ10PLUS','���ڵ���',1490000,to_date('2017/12/24','yyyy/mm/dd'))";
//		pstmt.executeUpdate(insertSql);
//		System.out.println(insertSql+"�� �ԷµǾ����ϴ�.");
//		String deleteSql = "DELETE s_product where no = 10025";
//		pstmt.executeUpdate(deleteSql);
//		System.out.println(deleteSql+"�� ������ �����Ǿ����ϴ�.");
	}

}