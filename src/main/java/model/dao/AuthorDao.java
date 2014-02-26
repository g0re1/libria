package model.dao;

import model.dao.base.BaseDao;
import model.entity.Author;
import org.springframework.stereotype.Repository;

/**
 * @author gore
 * @date 2/13/14
 */
@Repository
public class AuthorDao extends BaseDao<Author>
{
	public AuthorDao( Class<Author> clazz )
	{
		super( clazz );
	}
}
