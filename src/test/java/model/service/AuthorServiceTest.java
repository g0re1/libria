package model.service;

import model.entity.Author;
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
public class AuthorServiceTest
{
	@Inject
	private AuthorService authorService;

	@Test
	public void testCreateAccount()
	{
		String name = "author";
		final Author author = this.authorService.create( name );
		assertThat( author.getName(), equalTo( name ) );
	}


}
