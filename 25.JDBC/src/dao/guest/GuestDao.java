package dao.guest;

import java.util.ArrayList;

/*
   - insert
   - selectByNo or selectById
   - selectAll
   - updateById or updateByNo
   - deleteById or updateByNo
 */
public interface GuestDao {
	/*
	 * Create
	 */
	public int insertGuest (Guest guest) throws Exception;
	/*
	 * Read
	 */
	public Guest selectByNo(int no)throws Exception;
	public ArrayList<Guest> selectByAll() throws Exception;
	/*
	 * Update
	 */
	public int updateGuest(Guest updateguest) throws Exception;
	
	/*
	 * Delete
	 */
	public int deleteGuest(int no) throws Exception;

}
