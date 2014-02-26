package model.entity;

import model.entity.base.BaseEntity;
import javax.persistence.*;

/**
 * @author gore
 * @date 2/13/14
 */

@Entity
@Table( name = "room" )
@SequenceGenerator( name = "seq", sequenceName = "seq_room" )
@AttributeOverrides( { @AttributeOverride( name = "id", column = @Column( name = "room_id" ) ),
		@AttributeOverride( name = "created", column = @Column( name = "room_created" ) ),
		@AttributeOverride( name = "modified", column = @Column( name = "room_modified" ) ) } )
public class Room extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	@Column( name = "room_name" )
	private String name;

	public Room()
	{
	}

	public Room( String name )
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
