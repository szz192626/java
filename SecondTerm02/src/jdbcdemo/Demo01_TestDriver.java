package jdbcdemo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;


public class Demo01_TestDriver {
	
	/* �����һ�����ݿ����ӻ�ȡ��ʽ
	 * 1. �����ݿ��������������Ŀ
	 * 2. ����Class.forName(��������������)�����ض�Ӧ���ݿ����������
	 * 3. ����DriverManager.getConnection(url,username,password)���õ����ݿ�����
	 * 4. �رյ�������õ����ݿ����ӡ� 
	 */
	@Test
	public void testDriverManager(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/myjavadb";
		
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url, "root", "root");
			System.out.println(connection);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(connection!=null){
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void testDriverManagerOptimized(){
		
		Connection connection=null;
		try {
			connection=DBUtils.getConnection();
			System.out.println(connection);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
        DBUtils.closeResource(connection, null);
	}
	/*
	 * ֱ��ʹ�����ݿ������������ʵ�����õ����ݿ����ӣ����븴���Բ��ã�������ʹ��
	 * 1. ֱ��ͨ�����ݿ������е�ʵ�������õ�Driver�ӿ�ʵ����
	 * 2. ͨ��Driver��connect�����õ����ݿ����ӣ�
	 *    ����Ϊurl�ͱ�ʶ�û���Ϣ��Propertiesʵ��(����Ҫ����user��password��������)
	 * 3. �رյ�2���õ������ݿ����ӡ�
	 */
	@Test
	public void testDriver(){
		Driver driver = null;
		Connection connection=null;
		
		try {
			driver = new com.mysql.jdbc.Driver();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/myjavadb";
		Properties prop=new Properties();
		prop.setProperty("user", "root");
		prop.setProperty("password", "root");
		
		try {
			connection=driver.connect(url, prop);
			System.out.println(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(connection!=null){
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
