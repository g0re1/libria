package model.entity.base;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author gore
 * @date 2/13/14
 */
@MappedSuperclass
public abstract class LibriaEntity implements Serializable, Cloneable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "seq" )
	private Long id;

	protected LibriaEntity()
	{
	}

	public Long getId()
	{
		return this.id;
	}

	public void setId( Long id )
	{
		this.id = id;
	}

}
