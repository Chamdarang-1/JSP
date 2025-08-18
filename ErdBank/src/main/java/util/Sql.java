package util;

public class Sql {

	public final static String SELECT_CUSTOMER_BY_NO_AND_NAME = "SELECT * FROM BANK_CUSTOMER WHERE C_NO=? AND C_NAME=?";

	
	public final static String SELECT_CUSTOMER_WITH_ACCOUNT_NO = "SELECT C.*, A.A_NO FROM BANK_CUSTOMER C "
			+ "JOIN BANK_ACCOUNT A ON C.C_NO = A.A_C_NO "
			+ "WHERE C_NO = ?";

	
	// Account
	public final static String SELECT_ALL_ACCOUNT_WITH_NAME = "select a.*, c.c_name " // 마지막 띄어쓰기
			+ "from bank_account a "
			+ "join bank_customer c on a.a_c_no = c.c_no";
	
	public final static String SELECT_ACCOUNT_BY_NO= "SELECT * FROM BANK_ACCOUNT WHERE A_NO = ?";

	public final static String UPDATE_ACCOUNT_PLUS= "UPDATE BANK_ACCOUNT SET A_BALANCE = A_BALANCE + ? WHERE A_NO=?";

	public final static String UPDATE_ACCOUNT_MINUS= "UPDATE BANK_ACCOUNT SET A_BALANCE = A_BALANCE - ? WHERE A_NO=?";
	
	// Transaction
	public final static String INSERT_TRANSACTION = "INSERT INTO BANK_TRANSACTION(T_A_NO, T_DIST, T_AMOUNT, T_DATETIME) VALUES(?,?,?,SYSDATE)";
	
	
}
