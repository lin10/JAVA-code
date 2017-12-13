package pers.onezero.jicheng;

import org.springframework.beans.factory.annotation.Required;

public class ozJich implements ozjcInter{
    
	private String name;
	private int year;
	private String job;
	@Required
	public void setname(String name){
		this.name = name;
	}
	public String getname(){
		return name;
	}
	public void setyear(int year){
		this.year = year;
	}
	public int getyear(){
		return year;
	}
	public void setjob(String job){
		this.job = job;
	}
    public String getjob(){
    	return job;
    }
	public void printJich(){
		System.out.println("name: "+name+"\nyear: "+year+"\njob: "+job);
	}
	
	public void cleanUp() throws Exception{
		System.out.println("Context is destroy, ozJich clean up");
	}
	
}
