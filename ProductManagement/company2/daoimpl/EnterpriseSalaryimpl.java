package daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.DBUtils2;
import dao.SalaryDao;
import entity.EnterpriseSalary;

public class EnterpriseSalaryimpl implements SalaryDao{

	@Override
	public int add(EnterpriseSalary salaypriseSalary) {
		int code=0;
		String sql="insert into salary(ID,name,basepay,welfare,reward,insurance,funds,mouth,remark) values(?,?,?,?,?,?,?,?,?)";
		code=DBUtils2.update(sql, salaypriseSalary.getID(),salaypriseSalary.getName(),salaypriseSalary.getBasepay(),salaypriseSalary.getWelfare(),
				salaypriseSalary.getReward(),salaypriseSalary.getInsurance(),salaypriseSalary.getFunds(),salaypriseSalary.getMouth(),salaypriseSalary.getRemark());
		return code;
	}
	@Override
	public List<EnterpriseSalary> getEnterpriseSalary(EnterpriseSalary enterpriseSalary) {
		String sql="select * from salary where name=? and password=?";
		List<EnterpriseSalary>enterpriseSalarielist=new ArrayList<EnterpriseSalary>();
		List<Map<String,Object>>maplist=DBUtils2.query(sql,enterpriseSalary.getID(),enterpriseSalary.getName(),
				enterpriseSalary.getBasepay(),enterpriseSalary.getWelfare(),enterpriseSalary.getReward(),enterpriseSalary.getInsurance(),enterpriseSalary.getFunds()
				,enterpriseSalary.getMouth(),enterpriseSalary.getRemark());
		    for(Map<String, Object>map:maplist) {       
		    	EnterpriseSalary et=new EnterpriseSalary();
		    	et.setID((String)(map.get("id")));
		    	et.setName((String)(map.get("name")));
		    	et.setBasepay((Integer)(map.get("welfare")));
		    	et.setWelfare((Integer)(map.get("welfare")));
		    	et.setReward((Integer)(map.get("reward")));
		    	et.setInsurance((Integer)(map.get("insurance")));
		    	et.setFunds((Integer)(map.get("funds")));
		    	et.setMouth((String)(map.get("month")));;
		    	et.setRemark((String)(map.get("remark")));
		    	enterpriseSalarielist.add(et);
		    	
		    }
		    return enterpriseSalarielist;
	}

       
}
