package co.micol.manager.boarder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonDao {
	
	private static SingletonDao orcl;
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "jjw";
	private String password = "jjw";
	
	private Connection connection;
	
	private SingletonDao() {}	// 외부에서 나를 만들지 못하도록 일찌감치 private로 생성
	
	public static SingletonDao getInstance() {
		if(orcl == null) {
			orcl = new SingletonDao();	// 메모리에 할당되지 않았을 때 할당하는 방법
		}
		return orcl;
	}
	
	public Connection getConnection() {
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("연결 OK");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("연결 X");
		}
		return connection;
	}
	

}
