package daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import dao.DBUtils2;
import dao.StudentDao;
import entity.Student;;

public class StudentDaolmpl implements StudentDao {

	@Override
	public int add(Student student) {
		int code =0;
		String sql="insert into Tstudent(id,name,class,studynum) values(?,?,?,?)";
		code=DBUtils2.update(sql, student.getId(),
				                 student.getName(),
				                 student.getClass1(),
				                 student.getStudynum());
		
		return code;
	}

	@Override
	public int delete(Student student) {
		// TODO Auto-generated method stub
		int code =0;
		String sql="delete from Tstudent where id=? ";
		code=DBUtils2.update(sql, student.getId());
		
		return code;
	}
    @Override
	public int delete(int student) {
		// TODO Auto-generated method stub
    	
		return 0;
	}

	@Override
	public List<Student> getById(int class0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet rs=null;
		Student student=null;
		List<Student>students=new ArrayList<Student>();
		try {
			try {
				connection=DBUtils2.getConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			statement=(PreparedStatement) connection.prepareStatement("select id,name,class,studynum from Tstudent");
			rs=statement.executeQuery();
		while(rs.next()) {
			student=new Student();
			student.setId(rs.getInt(1));
			student.setName(rs.getString(2));
			student.setClass1(rs.getInt(3));
			student.setStudynum(rs.getInt(4));
			students.add(student);
		}
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtils2.closeResource(connection, statement, rs);
		}
		
		return students;
	}

}
