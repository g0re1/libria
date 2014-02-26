package model.service;

import model.dao.AuthorDao;
import model.entity.Author;
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
public class AuthorService extends BaseService
{
	@Inject
	private AuthorDao authorDao;


	@Transactional
	public Author create( String name )
	{
		return this.authorDao.save( new Author( name ) );
	}
}
