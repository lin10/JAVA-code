package pers.onezero.el.com;

public class Job {
    public String name;
    public String address;
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
