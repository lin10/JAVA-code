package pers.onezero.el.comel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**Spring EL三元运算*/
@Component("jobBean")
public class JobEl {
	@Value("#{'Software engineer'.toUpperCase()}")
    public String name;
	
	@Value("#{'Shenzhen'}")
    public String address;
	
	@Value("#{salaryBean.getSpecialSalary()}")
    public double salary;
	
	@Value("#{salaryBean.getSpecialSalary() > 8000 ? true : false}")
	public Boolean status;
    
    public void setName(String name){
    	this.name = name;
    }
    public String getname(){
    	return name;
    }
    public void setAddress(String address){
    	this.address = address;
    }
    public String getaddress(){
    	return address;
    }
    public void setSalary(double salary){
    	this.salary = salary;
    }
    public double getsalary(){
    	return salary;
    }
    public void setStatus(Boolean status){
    	this.status = status;
    }
    public Boolean getStatus(){
    	return status;
    }
    public String toString(){
    	return "职位名称："+name+"\n地址："+address+"\n薪资："+salary+"\n是否高薪："+status;
    }
}
