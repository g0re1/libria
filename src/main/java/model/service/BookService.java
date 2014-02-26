package model.service;

import javax.inject.Inject;

import model.dao.BookDao;
import model.entity.*;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author gore
 * @date 2/13/14
 */
public class BookService
{
	@Inject
	private BookDao bookDao;

	@Transactional
	public Book create( String name, Account account, Author author, Category category,Room room )
	{
		return this.bookDao.save( new Book( name, account, author, category,room ) );
	}
}
