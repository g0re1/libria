package model.dao;

import model.dao.base.BaseDao;
import model.entity.Account;
import org.springframework.stereotype.Repository;

/**
 * @author gore
 * @date 2/13/14
 */
@Repository
public class AccountDao extends BaseDao<Account>
{
	public AccountDao( Class<Account> clazz )
	{
		super( clazz );
	}
}
