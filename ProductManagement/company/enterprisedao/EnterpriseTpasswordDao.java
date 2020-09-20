package enterprisedao;


import java.util.List;

import enterpriseEntity.EnterpriseTpassword;

public interface EnterpriseTpasswordDao {
         int add(EnterpriseTpassword enterpriseTpassword);
         int delete(EnterpriseTpassword enterpriseTpassword);
         int delete(int enterpriseTpassword);
         List<EnterpriseTpassword>getById(int id);
         List<EnterpriseTpassword>getAll();
}
