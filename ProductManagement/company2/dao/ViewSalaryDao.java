package dao;

import java.util.List;

import entity.EnterpriseViewSalary;

public interface ViewSalaryDao {
          int add(EnterpriseViewSalary enterpriseViewSalary );
          List<EnterpriseViewSalary>getById(int id);
          List<EnterpriseViewSalary>getAll();
          
}
