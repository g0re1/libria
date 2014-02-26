package model.service;

import model.dao.RoomDao;
import model.entity.Room;
import model.service.base.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * @author gore
 * @date 2/13/14
 */
@Service
@Transactional
public class RoomService extends BaseService
{
	@Inject
	private RoomDao roomDao;

	@Transactional
	public Room create( String name )
	{
		return this.roomDao.save( new Room( name ) );
	}
}
