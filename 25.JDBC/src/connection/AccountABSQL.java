package connection;

public class AccountABSQL {
	String updateSqlA="update accountA set acc_balance = acc_balance - ? where acc_no = ?";
	String updateSqlB="update accountB set acc_balance = acc_balance + ? where acc_no = ?";
	String selectSqlA="select acc_balance from accountA where acc_no=?";
	String selectSqlB="select acc_balance from accountB where acc_no=?";
}
