package enterprisedao;

import java.util.List;

import enterpriseEntity.EnterpriseUser;

public interface EnterpriseUserDao {
     int add(EnterpriseUser enterprise);
     List<EnterpriseUser>getEnterpriseUser(EnterpriseUser enterpriseUser);
}
