package daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.DBUtils2;
import dao.UserDao;

import entity.User;

public class UserDaoImpl implements UserDao{

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		int code = 0;
		String sql = "insert into users (name,password) values(?,?)";

		code = DBUtils2.update(sql,user.getName(),user.getPassword());

		return code;
	}

	@Override
	public List<User> getUser(User user) {
		// TODO Auto-generated method stub
		String sql="select * from users where name=? and password=?";
		List<User>userlist=new ArrayList<User>();
		List<Map<String, Object>>maplist=DBUtils2.query(sql,user.getName(),user.getPassword());
		for(Map<String, Object> map:maplist) {
			User us=new User();
			us.setId((Integer)(map.get("id")));
			us.setName((String)(map.get("name")));
			us.setPassword((String)(map.get("password")));
			
			userlist.add(us);
		}
		
		
		return userlist;
	}
}