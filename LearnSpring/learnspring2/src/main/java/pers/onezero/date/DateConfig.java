package pers.onezero.date;

import java.util.Date;

public class DateConfig {
	Date date;
	
	public Date getDate(){
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	@Override
	public String toString(){
		return "Date: "+date;
	}
}
