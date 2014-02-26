package model.dao;

import model.dao.base.BaseDao;
import model.entity.Room;
import org.springframework.stereotype.Repository;

/**
 * @author gore
 * @date 2/13/14
 */
@Repository
public class RoomDao extends BaseDao<Room>
{
	public RoomDao( Class<Room> clazz )
	{
		super( clazz );
	}
}
