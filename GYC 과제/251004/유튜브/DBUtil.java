package ch1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "c##osaka";
	private static final String PW = "1234";
	
	//Connection객체 반환 메서드
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(URL,USER,PW);
		} catch (Exception e) {
			System.out.println("DB 연결 실패: "+e.getMessage());
		}
		return null;
	}
}
