package model.dao.base;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


@Transactional
public abstract class BaseDao<T>
{
	protected final Log logger = LogFactory.getLog( this.getClass() );

	@PersistenceContext()
	protected EntityManager entityManager;

	protected Class<T> clazz;

	protected BaseDao()
	{
		super();
	}

	public BaseDao( Class<T> clazz )
	{
		super();
		this.clazz = clazz;
	}

	public T getById( Long id )
	{
		return this.entityManager.find( this.clazz, id );
	}

	@Transactional
	public T save( T object )
	{
		return this.entityManager.merge( object );

	}

	public void refresh( T object )
	{
		this.entityManager.refresh( object );
	}

	@Transactional
	public void remove( T object )
	{
		this.entityManager.remove( object );
	}

	public Long getCount()
	{
		CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = cb.createQuery( Long.class );
		cq.select( cb.count( cq.from( this.clazz ) ) );

		return this.entityManager.createQuery( cq ).getSingleResult();
	}

	public List<T> getAll()
	{
		CriteriaQuery<T> query = this.entityManager.getCriteriaBuilder().createQuery( this.clazz );
		query.from( this.clazz );
		TypedQuery<T> typedQuery = this.entityManager.createQuery( query );
		return typedQuery.getResultList();
	}

	public void removeById( Long id )
	{
		T object = this.getById( id );
		if( object != null )
		{
			this.entityManager.remove( object );
		}
	}

	public int countAll()
	{
		int valueToReturn = 0;
		CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = cb.createQuery( Long.class );
		Root<T> account = cq.from( this.clazz );
		cq.select( cb.count( account ) );

		try
		{
			valueToReturn = this.entityManager.createQuery( cq ).getSingleResult().intValue();
		}
		catch( NumberFormatException ex )
		{
			// nothing to do
		}

		return valueToReturn;
	}

	public List<T> getSorted( String orderBy, String order, int firstResult, int maxResult )
	{
		CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery( this.clazz );
		Root<T> object = query.from( this.clazz );
		if( "asc".equals( order ) )
		{
			query.orderBy( builder.asc( object.get( orderBy ) ) );
		}
		else
		{
			query.orderBy( builder.desc( object.get( orderBy ) ) );
		}
		TypedQuery<T> typedQuery = this.entityManager.createQuery( query );
		typedQuery.setFirstResult( firstResult );
		typedQuery.setMaxResults( maxResult );
		return typedQuery.getResultList();
	}


}
