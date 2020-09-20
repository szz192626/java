package daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.DBUtils2;
import dao.EnterpriseBMDao;
import entity.EnterpriseBM;
import entity.Student;

public class EnterpriseBMimpl implements EnterpriseBMDao{

	
	public int add(EnterpriseBM enterprise) {
		int code=0;
		String sql="insert into department(ID,Name,Director,Number) values(?,?,?,?)";
		code=DBUtils2.update(sql, enterprise.getID(),enterprise.getName(),enterprise.getDirector(),enterprise.getNumber());
		return code;
	}

	@Override
	public int delete(EnterpriseBM enterpriseBM) {
		int code=0;
		String sql="delete from department where ID=?";
		return code;
	}

	@Override
	public int delete(int enterpriseBM) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EnterpriseBM> getId(int num) {
		String aql="select * from department where Number=?";
		List<EnterpriseBM> enterpriseBMlist=new ArrayList<EnterpriseBM>();
		List<Map<String,Object>> maplist=DBUtils2.query(aql, new Integer(num));
		for(Map<String, Object>map:maplist) {
			EnterpriseBM enterpriseBM=new EnterpriseBM();
			enterpriseBM.setID((String)(map.get("ID")));
			enterpriseBM.setName((String)(map.get("Name")));
			enterpriseBM.setDirector((String)(map.get("Director")));
			enterpriseBM.setNumber((Integer)(map.get("num")));
			
			enterpriseBMlist.add(enterpriseBM);
		}
		
		
		return enterpriseBMlist;
	}

	@Override
	public List<EnterpriseBM> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
