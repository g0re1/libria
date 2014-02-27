package model.service;

import model.entity.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
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
public class CategoryServiceTest
{
	@Inject
	private CategoryService categoryService;

	@Test
	public void testCreateCategory()
	{
		final Category category = this.categoryService.create( "category" );
		assertThat( category.getName(), equalTo( "category" ) );
	}
}
