package model.dao;

import model.dao.base.BaseDao;
import model.entity.Category;
import org.springframework.stereotype.Repository;

/**
 * @author gore
 * @date 2/13/14
 */
@Repository
public class CategoryDao extends BaseDao<Category>
{
	public CategoryDao( Class<Category> clazz )
	{
		super( clazz );
	}
}
