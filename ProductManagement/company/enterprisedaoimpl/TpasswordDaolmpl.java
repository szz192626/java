package enterprisedaoimpl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import enterprisedao.EnterprisedaoDBUtils;
import enterprisedao.EnterpriseTpasswordDao;
import enterpriseEntity.EnterpriseTpassword;

public class TpasswordDaolmpl implements EnterpriseTpasswordDao {
	@Override
	public int add(EnterpriseTpassword enterpriseTpassword) {
		// TODO Auto-generated method stub
		int code = 0;
		String sql="insert into tpassword (id,user,password) values(?,?,?)";
		code=EnterprisedaoDBUtils.update(sql, enterpriseTpassword.getId(),
				enterpriseTpassword.getUser(),
				enterpriseTpassword.getPassword());	
		        return code;
	}

	@Override
	public int delete(EnterpriseTpassword enterpriseTpassword) {
		// TODO Auto-generated method stub
		int code = 0;
		String sql = "delete from tpassword where id=?";
		code=EnterprisedaoDBUtils.update(sql, enterpriseTpassword.getId());
	     return code;
	}

	@Override
	public int delete(int student) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public List<EnterpriseTpassword> getById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from tpassword where id=?";
		List<EnterpriseTpassword> enterpriseTpasswordlist = new ArrayList<EnterpriseTpassword>();
		List<Map<String, Object>> maplist = EnterprisedaoDBUtils.query(sql,new Integer(id));
		for (Map<String, Object> map : maplist) {
			EnterpriseTpassword enterpriseTpassword=new EnterpriseTpassword();
			enterpriseTpassword.setId((Integer)(map.get("id")));
			enterpriseTpassword.setUser((String)(map.get("user")));
			enterpriseTpassword.setPassword((String)(map.get("password")));
			
		}
		return enterpriseTpasswordlist;
	}

	@Override
	public List<EnterpriseTpassword> getAll() {
		
		return null;
	}

}

