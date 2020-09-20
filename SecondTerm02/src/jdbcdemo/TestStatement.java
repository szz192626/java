package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class TestStatement {

	@Test
	public void TestStatement1() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/myjavadb";
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection(url, "root", "root123");
			System.out.println(connection);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String sql = "insert  into student (id,name,birthday,score) values('1','cmy','2000-09-28','90')";
		String sql1 = "delete from student where id='0'";
		if (connection != null) {
			try {
				statement = connection.createStatement();
				System.out.println(statement.execute(sql));
				System.out.println(statement.execute(sql1));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
