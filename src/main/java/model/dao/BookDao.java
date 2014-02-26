package model.dao;

import model.dao.base.BaseDao;
import model.entity.Book;
import org.springframework.stereotype.Repository;

/**
 * @author gore
 * @date 2/13/14
 */
@Repository
public class BookDao extends BaseDao<Book>
{
	public BookDao( Class<Book> clazz )
	{
		super( clazz );
	}
}
