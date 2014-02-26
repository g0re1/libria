package model.entity;

import model.entity.base.BaseEntity;
import javax.persistence.*;

/**
 * @author gore
 * @date 2/13/14
 */

@Entity
@Table( name = "author" )
@SequenceGenerator( name = "seq", sequenceName = "seq_category" )
@AttributeOverrides( { @AttributeOverride( name = "id", column = @Column( name = "category_id" ) ),
		@AttributeOverride( name = "created", column = @Column( name = "category_created" ) ),
		@AttributeOverride( name = "modified", column = @Column( name = "category_modified" ) ) } )
public class Category extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	@Column( name = "category_name" )
	private String name;

	public Category()
	{
	}

	public Category( String name )
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
