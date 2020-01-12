import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionMain {

	public static void main(String[] args) throws SQLException {
		System.out.println("stmt1");
		DriverManager.getConnection("");
		System.out.println("stmt2");

	}

}
