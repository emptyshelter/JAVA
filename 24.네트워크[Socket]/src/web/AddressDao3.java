package web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import server.AddressSQL;

/*
Dao(Data Access Object)
 - 멤버들의 데이터를 저장하고있는 테이블에
   CRUD(Create, Read, Update, Delete) 작업을 할수있는
   단위메쏘드를 가지고있는 클래스
 - AddressService객체의 요청(메쏘드호출)을 받아서 
   Data Access(DB)에 관련된 단위기능(CRUD)을
   수행하는 객체
 */
public class AddressDao3 {
	public int insert(Address address) throws Exception {
		
		Connection con = ConnectionFactory.getConnection();		
		PreparedStatement pstmt = con.prepareStatement(AddressSQL.ADDRESS_INSERT);
		pstmt.setString(1, address.getId());
		pstmt.setString(2, address.getName());
		pstmt.setString(3, address.getPhone());
		pstmt.setString(4, address.getAddress());
		int result = pstmt.executeUpdate();
		System.out.println(result+"개가 업데이트되었습니다.");
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return result;
		}
	public int insert(String id, String name, String phone, String address)throws Exception {
		String insertSql=
				"insert into address values(address_no_seq.nextval,'"+id+"'||address_no_seq.currval,'"+name+"','"+phone+"','"+address+"')";
		Connection con = ConnectionFactory.getConnection();		
		PreparedStatement pstmt = con.prepareStatement(insertSql);
		pstmt.setString(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, phone);
		pstmt.setString(4, address);
		int result = pstmt.executeUpdate();
		System.out.println(result+"개가 업데이트되었습니다.");
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return result;
	}
	public int delete(int i) throws Exception {
		Connection con = ConnectionFactory.getConnection();		
		PreparedStatement pstmt = con.prepareStatement(AddressSQL.ADDRESS_DELETE);
		pstmt.setInt(1, i);
		int result = pstmt.executeUpdate();
		System.out.println(result+"개가 업데이트되었습니다.");
		pstmt.close();
		ConnectionFactory.releaseConnection(con);;
		return result;
	}
	public int update(Address address) throws Exception {
		Connection con = ConnectionFactory.getConnection();		
		PreparedStatement pstmt = con.prepareStatement(AddressSQL.ADDRESS_UPDATE);
		pstmt.setString(1, address.getId());
		pstmt.setString(2, address.getName());
		pstmt.setString(3, address.getPhone());
		pstmt.setString(4, address.getAddress());
		pstmt.setInt(5, address.getNo());
		int result = pstmt.executeUpdate();
		System.out.println(result+"개가 업데이트되었습니다.");
		pstmt.close();
		ConnectionFactory.releaseConnection(con);;
		return result;
	}
	public Address selectByPk(int i) throws Exception {
		Address findAddress = null;
		Connection con = ConnectionFactory.getConnection();		
		PreparedStatement pstmt = con.prepareStatement(AddressSQL.ADDRESS_SELECT_PK);
		pstmt.setInt(1, i);
		ResultSet rs = pstmt.executeQuery();
		System.out.println("------------------------------------------------");
		System.out.println("NO \t ID \t NAME \t PHONE \t\t ADDRESS");
		System.out.println("------------------------------------------------");
		if (rs.next()) {
			findAddress=
					new Address(rs.getInt("no"),
								rs.getString("id"),
								rs.getString("name"),
								rs.getString("phone"),
								rs.getString("address"));
		} 
		rs.close();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);;
		return findAddress;
	}
	public ArrayList<Address> selectAll() throws Exception {
		ArrayList<Address> addressList = new ArrayList<Address>();
		
		Connection con = ConnectionFactory.getConnection();		
		PreparedStatement pstmt = con.prepareStatement(AddressSQL.ADDRESS_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		System.out.println("------------------------------------------------");
		System.out.println("NO \t ID \t NAME \t PHONE \t\t ADDRESS");
		System.out.println("------------------------------------------------");
		while (rs.next()) {
			addressList.add(new Address(rs.getInt("no"),
										rs.getString("id"),
										rs.getString("name"),
										rs.getString("phone"),
										rs.getString("address")));

		} 
		rs.close();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);;
		return addressList;
	}
	

}
