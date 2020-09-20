package daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.DBUtils2;
import dao.EnterpriseInformationDao;
import entity.EnterpriseInformation;

public class EnterpriseInformationimpl implements EnterpriseInformationDao{

	@Override
	public int add(EnterpriseInformation enterprise) {
		int code=0;
		String sql="insert into employee(ID,name,sex,age,department,position,phone,time,address) values(?,?,?,?,?,?,?,?,?)";
        code=DBUtils2.update(sql, enterprise.getID(),enterprise.getName(),enterprise.getSex(),enterprise.getAge(),
        		enterprise.getDepartment(),enterprise.getPosition(),enterprise.getTime(),enterprise.getAddress());		
		return code;
	}

	@Override
	public int delete(EnterpriseInformation enterpriseInformation) {
		int code=0;
		String sql="delete from employee where ID=?";
		return code;
	}

	@Override
	public int delete(int enterpriseInformation) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EnterpriseInformation> getById(int id) {
		String aql="select * from employee where ID=?";
		List<EnterpriseInformation> enterpriseInformationlist=new ArrayList<EnterpriseInformation>();
        List<Map<String , Object>>maplist=DBUtils2.query(aql, new Integer(id));
        for(Map<String, Object>map:maplist) {
        	EnterpriseInformation enterpriseInformation=new EnterpriseInformation();
        	enterpriseInformation.setID((String)(map.get("ID")));
        	enterpriseInformation.setName((String)(map.get("name")));
        	enterpriseInformation.setSex((String)(map.get("sex")));
        	enterpriseInformation.setAge((Integer)(map.get("age")));
        	enterpriseInformation.setDepartment((String)(map.get("department")));
        	enterpriseInformation.setPosition((String)(map.get("position")));
        	enterpriseInformation.setPhone((String)(map.get("phone")));
        	enterpriseInformation.setTime((String)(map.get("time")));
        	enterpriseInformation.setAddress((String)(map.get("address")));
        	
        	enterpriseInformationlist.add(enterpriseInformation);
        }
        
        
		return enterpriseInformationlist;
	}

	@Override
	public List<EnterpriseInformation> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
}
