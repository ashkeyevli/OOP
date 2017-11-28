package course;

import java.util.Date;

import enums.Type;
import enums.Week;

public class Subject {
	private Date time;
	private int room;
	private Week weekday;
	private Type type;
	public Date getTime() 
	{
		return time;
	}
	public int getRoom() 
	{
		return room;
	}
	public Week getDay() 
	{
		return weekday;
	}
	public Type getType() 
	{
		return type;
	}
	public void setTime(Date time) 
	{
		this.time=time;
	}
	public void setRoom(int room) 
	{
		this.room=room;
	}
	public void setDay(Week w) 
	{
		this.weekday=w;
	}
	public void setType(Type t) 
	{
		this.type=t;
	}
}

