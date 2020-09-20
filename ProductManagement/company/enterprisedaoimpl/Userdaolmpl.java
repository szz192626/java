package enterprisedaoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import enterpriseEntity.EnterpriseUser;
import enterprisedao.EnterpriseUserDao;
import enterprisedao.EnterprisedaoDBUtils;


public class Userdaolmpl implements EnterpriseUserDao{

	@Override
	public int add(EnterpriseUser enterprise) {
		// TODO Auto-generated method stub
		int code = 0;
		String sql = "insert into users (name,password) values(?,?)";

		code = EnterprisedaoDBUtils.update(sql,enterprise.getName(),enterprise.getPassword());

		return code;
	}

	@Override
	public List<EnterpriseUser> getEnterpriseUser(EnterpriseUser enterpriseUser) {
		// TODO Auto-generated method stub
		String sql="select * from users where name=? and password=?";
		List<EnterpriseUser>userlist=new ArrayList<EnterpriseUser>();
		List<Map<String, Object>>maplist=EnterprisedaoDBUtils.query(sql,enterpriseUser.getName(),enterpriseUser.getPassword());
		for(Map<String, Object> map:maplist) {
			EnterpriseUser us=new EnterpriseUser();
			us.setId((Integer)(map.get("id")));
			us.setName((String)(map.get("name")));
			us.setPassword((String)(map.get("password")));
			
			userlist.add(us);
	}
		return userlist;
}
}