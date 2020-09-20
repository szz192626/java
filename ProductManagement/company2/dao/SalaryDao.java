package dao;

import java.util.List;

import entity.EnterpriseSalary;

public interface SalaryDao {
	    int add(EnterpriseSalary salaypriseSalary);
        
        List<EnterpriseSalary>getEnterpriseSalary(EnterpriseSalary enterpriseSalary);
}
