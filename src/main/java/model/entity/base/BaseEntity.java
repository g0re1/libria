package model.entity.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author gore
 * @date 2/13/14
 */
@MappedSuperclass
public abstract class BaseEntity extends LibriaEntity
{
	/* serial version UID */
	private static final long serialVersionUID = 1L;

	@Column( nullable = false )
	@Temporal( TemporalType.TIMESTAMP )
	private Date created;
	@Column( nullable = false )
	@Temporal( TemporalType.TIMESTAMP )
	private Date modified;

	public BaseEntity()
	{
		super();
	}

	public Date getCreated()
	{
		return this.created;
	}

	public void setCreated( Date created )
	{
		this.created = created;
	}

	public Date getModified()
	{
		return this.modified;
	}

	public void setModified( Date modified )
	{
		this.modified = modified;
	}
}