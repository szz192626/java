package daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.DBUtils2;
import dao.StudentDao;

import entity.Student;;

public class StudentDaolmpl2 implements StudentDao {

	@Override
	public int add(Student student) {
		int code = 0;
		String sql = "insert into Tstudent(id,name,class,studynum) values(?,?,?,?)";
		code = DBUtils2.update(sql, student.getId(), student.getName(), student.getClass1(), student.getStudynum());

		return code;
	}

	@Override
	public int delete(Student student) {
		// TODO Auto-generated method stub
		int code = 0;
		String sql = "delete from Tstudent where id=? ";
		code = DBUtils2.update(sql, student.getId());

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
		String aql = "select * from tstudent where class=?";
		List<Student> studentlist = new ArrayList<Student>();
		List<Map<String, Object>> maplist = DBUtils2.query(aql, new Integer(class0));
		for (Map<String, Object> map : maplist) {
			Student student = new Student();
			student.setId((Integer) (map.get("id")));
			student.setName((String) (map.get("name")));
			student.setClass1((Integer) (map.get("class")));
			student.setStudynum((Integer) (map.get("studynum")));

			studentlist.add(student);
		}
		return studentlist;
	}

	@Override
	public List<Student> getAll() {
		return null;
	}

}
