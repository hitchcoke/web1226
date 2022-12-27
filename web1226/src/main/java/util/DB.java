package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
	public Connection getConnection() throws Exception{
		
		
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/type","root","java1234");
		
		
		return conn;
		}
	public void close(ResultSet rs, PreparedStatement stmt, Connection conn) throws Exception{
		
		if(conn!=null) {
			conn.close();}
		
		if(rs!=null) {
			rs.close();}
		
		if(stmt!=null) {
			stmt.close();}
	}
}
