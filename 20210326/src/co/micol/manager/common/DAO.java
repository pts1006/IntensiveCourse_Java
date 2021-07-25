package co.micol.manager.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "jjw";
	private String password = "jjw";
	
	public Connection conn;	//연결객체
	
	public DAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("연결실패!!");
		}
			
	}
	
}
