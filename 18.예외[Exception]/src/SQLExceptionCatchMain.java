import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionCatchMain {

	public static void main(String[] args)  {
		System.out.println("stmt1");
		try {
			System.out.println("tyr1");
			DriverManager.getConnection("");
			System.out.println("tyr2");
		} catch (SQLException e) {
			System.out.println("catch1");
			System.out.println("msg: "+e.getMessage());
			System.out.println(">>클라이언트 메세지: 죄송합니다.");
			System.out.println("catch2");
		}
		System.out.println("stmt2");

	}

}
