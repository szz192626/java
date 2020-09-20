package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.ResultSetMetaData;

public class DBUtils {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
//可以通过url中增加“？useUnicode=true&characterEncoding=utf-8”来指定编码问题
		String url = "jdbc:mysql://localhost:3306/myjavadb";

		Connection connection = null;
		PreparedStatement statement = null;
		connection = DriverManager.getConnection(url, "root", "root123");
		/* System.out.println(connection); */

		return connection;
	}

	public static void closeResource(Connection connection, Statement statement) {
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

	public static void closeResource(Connection connection, Statement statement, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
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
//	public static int update(Connection connection,String sql,Object...objs){
//		
//		PreparedStatement statement = null;
//		int code=0;
//		try {
//			statement = connection
//					.prepareStatement(sql);
//			for(int i=0;i<objs.length;i++){
//			    statement.setObject(i+1, objs[i]);
//			}
//			code=statement.executeUpdate();
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		closeResource(null, statement);
//		
//		return code;
//		
//	}

	public static int update(String sql, Object... objs) {
		Connection connection = null;

		int code = 0;
		PreparedStatement statement = null;
		try {
			connection = DBUtils2.getConnection();
			statement = connection.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				statement.setObject(i + 1, objs[i]);
			}
			code = statement.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			closeResource(connection, statement);
		}

		return code;
	}

	public static List<Map<String, Object>> query(String sql, Object... objs) {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			connection = DBUtils2.getConnection();
			statement = connection.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				statement.setObject(i + 1, objs[i]);
			}
			rs = statement.executeQuery();

			ResultSetMetaData rsmd = rs.getMetaData();

//			for(int i=0;i<rsmd.getColumnCount();i++){
//				System.out.println(rsmd.getColumnLabel(i+1));
//			}

			while (rs.next()) {
				HashMap<String, Object> entry = new HashMap<>();
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					entry.put(rsmd.getColumnLabel(i+1), rs.getObject(i + 1));
				}
				list.add(entry);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			closeResource(connection, statement, rs);
		}

		return list;
	}

}
