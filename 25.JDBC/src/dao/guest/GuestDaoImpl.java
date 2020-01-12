package dao.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GuestDaoImpl implements GuestDao{

	@Override
	public int insertGuest(Guest guest) throws Exception {
		Connection con = GuestFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_INSERT);
		pstmt.setString(1, guest.getGuest_name());
		pstmt.setString(2, guest.getGuest_email());
		pstmt.setString(3, guest.getGuest_homepage());
		pstmt.setString(4, guest.getGuest_title());
		pstmt.setString(5, guest.getGuest_content());
		int result = pstmt.executeUpdate();
		return result;
	}

	@Override
	public Guest selectByNo(int no) throws Exception {
		Guest findByNo = null;
		Connection con = GuestFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_SELECT_NO);
		pstmt.setInt(1, no);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			findByNo = new Guest(rs.getInt("guest_no"), rs.getString("guest_name"), 
								 rs.getDate("guest_date"), rs.getString("guest_email"), 
								 rs.getString("guest_homepage"), rs.getString("guest_title"), rs.getString("guest_content"));
		}
		return findByNo;
	}

	@Override
	public ArrayList<Guest> selectByAll() throws Exception {
		ArrayList<Guest> findByAll = new ArrayList<Guest>();
		Connection con = GuestFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Guest tempGuest = new Guest(rs.getInt("guest_no"), rs.getString("guest_name"), 
					 					rs.getDate("guest_date"), rs.getString("guest_email"), 
					 					rs.getString("guest_homepage"), rs.getString("guest_title"), rs.getString("guest_content"));
			findByAll.add(tempGuest);
		}
		return findByAll;
	}

	@Override
	public int updateGuest(Guest updateguest) throws Exception {
		Connection con = GuestFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_UPDATE);
		pstmt.setString(1, updateguest.getGuest_name());
		pstmt.setString(2, updateguest.getGuest_email());
		pstmt.setString(3, updateguest.getGuest_homepage());
		pstmt.setString(4, updateguest.getGuest_title());
		pstmt.setString(5, updateguest.getGuest_content());
		pstmt.setInt(6, updateguest.getGuest_no());
		int result = pstmt.executeUpdate();
		return result;
	}

	@Override
	public int deleteGuest(int no) throws Exception {
		Connection con = GuestFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_DELETE);
		pstmt.setInt(1, no);
		int result = pstmt.executeUpdate();
		return result;
	}

}
