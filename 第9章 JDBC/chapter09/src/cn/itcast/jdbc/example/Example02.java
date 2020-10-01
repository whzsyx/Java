package cn.itcast.jdbc.example;
import java.sql.*;

public class Example02 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		PreparedStatement  preStmt = null;
		try {
             // �������ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "itcast";
             // ����Ӧ�ó��������ݿ����ӵ�Connection����
			conn = DriverManager.getConnection(url, username, password);
			// ִ�е�SQL���
			String sql = "INSERT INTO users(name,password,email,birthday)"
					+ "VALUES(?,?,?,?)";
              // 1.����ִ��SQL����PreparedStatement����
			preStmt = conn.prepareStatement(sql);
              // 2.ΪSQL����еĲ�����ֵ
			preStmt.setString(1, "zl");
			preStmt.setString(2, "123456");
			preStmt.setString(3, "zl@sina.com");
			preStmt.setString(4, "1789-12-23");
              // 3.ִ��SQL
			preStmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {    // �ͷ���Դ
			if (preStmt != null) {
				try {
					preStmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				preStmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				conn = null;
			}
		}
	}
}