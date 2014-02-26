package model.service;

import model.dao.AccountDao;
import model.dao.AuthorDao;
import model.dao.CategoryDao;
import model.dao.RoomDao;
import model.entity.Account;
import model.entity.Author;
import model.entity.Book;
import model.entity.Category;
import model.entity.Room;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author gore
 * @date 2/13/14
 */

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = { "classpath:beanLocations.xml" } )
@Transactional
public class BookServiceTest
{
	@Inject
	private BookService bookService;
	@Inject
	private AccountDao accountDao;
	@Inject
	private AuthorDao authorDao;
	@Inject
	private CategoryDao categoryDao;
	@Inject
	private RoomDao roomDao;

    @Rollback(false)
	@Before
	public void setUp()
	{
		this.accountDao.save( new Account( "account" ) );
		this.authorDao.save( new Author( "author" ) );
		this.categoryDao.save( new Category( "category" ) );
		this.roomDao.save( new Room( "room" ) );
	}

	@Rollback( false )
	@Test
	public void testCreateAccount()
	{
		String name = "book";

		Account account = this.accountDao.getAll().get( 0 );
		Author author = this.authorDao.getAll().get( 0 );
		Category category = this.categoryDao.getAll().get( 0 );
		Room room = this.roomDao.getAll().get( 0 );

		final Book book = this.bookService.create( name, account, author, category, room );
		assertThat( book.getName(), equalTo( name ) );
	}
}
