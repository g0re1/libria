package model.service.base;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author gore
 * @date 2/13/14
 */

public abstract class BaseService
{
	protected Log logger = LogFactory.getLog( this.getClass() );

	public BaseService()
	{
		super();
	}
}