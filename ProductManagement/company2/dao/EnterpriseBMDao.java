package dao;

import java.util.List;

import entity.EnterpriseBM;

public interface EnterpriseBMDao {
          
	int add(EnterpriseBM enterprise);
	int delete(EnterpriseBM enterpriseBM);
	int delete(int enterpriseBM);
	List<EnterpriseBM>getId(int num);
	List<EnterpriseBM>getAll();
	
}
