package dao;

import java.util.List;

import entity.EnterpriseInformation;



public interface EnterpriseInformationDao {
         int   add(EnterpriseInformation enterprise);
         int   delete(EnterpriseInformation enterpriseInformation);
         int   delete(int enterpriseInformation);
         List<EnterpriseInformation>getById(int id);
         List<EnterpriseInformation>getAll();
         
}
