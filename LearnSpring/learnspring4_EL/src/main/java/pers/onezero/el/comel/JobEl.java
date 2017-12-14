package pers.onezero.el.comel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("jobBeanEl")
public class JobEl {
	@Value("name")
    public String name;
	
	@Value("address")
    public String address;
	
	@Value("yearsOfWorking")
    public int yearsOfWorking;
    
    public void setname(String name){
    	this.name = name;
    }
    public String getname(){
    	return name;
    }
    public void setaddress(String address){
    	this.address = address;
    }
    public String getaddress(){
    	return address;
    }
    public void setyearsOfWorking(int yearsOfWorking){
    	this.yearsOfWorking = yearsOfWorking;
    }
    public int getyearsOfWorking(){
    	return yearsOfWorking;
    }
}
