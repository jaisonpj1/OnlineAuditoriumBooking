package com.jaison.AuditoriumBooking.User.Data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jaison.AuditoriumBooking.User.Pojo.Events;

public class EventMapper implements RowMapper<Events> 
{
	@Override
	public Events mapRow(ResultSet events, int arg1) throws SQLException 
	{
		Events eventObj=new Events();
		eventObj.setEventId(events.getInt(1));
		eventObj.setEventName(events.getString(2));
		eventObj.setEventDate(events.getDate(3));
		eventObj.setDescription(events.getString(4));
		eventObj.setEventAmount(events.getDouble(5));
		eventObj.setImageFileName(events.getString(6));
		return eventObj;
	}
}
