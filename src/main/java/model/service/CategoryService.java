package model.service;

import model.dao.AccountDao;
import model.dao.CategoryDao;
import model.entity.Account;
import model.entity.Category;
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
public class CategoryService extends BaseService
{
	@Inject
	private CategoryDao categoryDao;

	@Transactional
	public Category create( String name )
	{
		return this.categoryDao.save( new Category( name ) );
	}
}
