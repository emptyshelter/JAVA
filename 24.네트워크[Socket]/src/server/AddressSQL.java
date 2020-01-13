package server;

public class AddressSQL {
	public static final String ADDRESS_INSERT=
			"insert into address values(address_no_seq.nextval,?,?,?,?)";
	public static final String ADDRESS_DELETE=
			"DELETE ADDRESS WHERE no = ?";
	public static final String ADDRESS_UPDATE=
			"UPDATE ADDRESS SET id = ?, name = ?,phone = ?,address = ? where no = ?";
	public static final String ADDRESS_SELECT_PK=
			"select * from address where no =?";
	public static final String ADDRESS_SELECT_ALL=
			"select * from address";
	
	
}
