package model.entity;

import model.entity.base.BaseEntity;
import javax.persistence.*;
import java.util.Date;

/**
 * @author gore
 * @date 2/13/14
 */

@Entity
@Table( name = "account" )
@SequenceGenerator( name = "seq", sequenceName = "seq_account" )
@AttributeOverrides( { @AttributeOverride( name = "id", column = @Column( name = "account_id" ) ),
		@AttributeOverride( name = "created", column = @Column( name = "account_created" ) ),
		@AttributeOverride( name = "modified", column = @Column( name = "account_modified" ) ) } )
public class Account extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	@Column( name = "account_name" )
	private String name;

	public Account()
	{
		super();
	}

	public Account( String name )
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
