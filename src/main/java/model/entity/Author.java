package model.entity;

import model.entity.base.BaseEntity;
import javax.persistence.*;

/**
 * @author gore
 * @date 2/13/14
 */

@Entity
@Table( name = "author" )
@SequenceGenerator( name = "seq", sequenceName = "seq_author" )
@AttributeOverrides( { @AttributeOverride( name = "id", column = @Column( name = "author_id" ) ),
		@AttributeOverride( name = "created", column = @Column( name = "author_created" ) ),
		@AttributeOverride( name = "modified", column = @Column( name = "author_modified" ) ) } )
public class Author extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	@Column( name = "author_name" )
	private String name;

	public Author()
	{
	}

	public Author( String name )
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName( String name )
	{
		this.name = name;
	}
}
