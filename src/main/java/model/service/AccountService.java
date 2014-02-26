package model.service;

import model.dao.AccountDao;
import model.entity.Account;
import model.service.base.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * @author gore
 * @date 2/13/14
 */

@Service
@Transactional
public class AccountService extends BaseService
{
	@Inject
	private AccountDao accountDao;

	public AccountService()
	{
	}

	@Transactional
	public Account create( String name )
	{
		return this.accountDao.save( new Account( name ) );
	}

}
