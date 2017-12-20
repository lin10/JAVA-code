package pers.onezero.el.comel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * Spring表达式语言 #{ SpEL expression } 
1.xml中在bean引用中可以直接使用#{bean}来引用bean的
2.如果使用注释则需要使用@Component(bean)来声明bean @Value(“Spring表达式语言”)来完成引用或者初始化
3.如果要在注解中使用spEL ，那么必须在使用注解注册组件

<context:component-scan base-package=com.yiibai.core />来定义扫描范围来获取bean配置
 * */
@Component("jobBean")
public class JobEl {
	@Value("#{'Software engineer'.toUpperCase()}")
    public String name;
	
	@Value("#{'Shenzhen'}")
    public String address;
	
	@Value("#{salaryBean.getSpecialSalary()}")
    public double salary;
    
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
    public String toString(){
    	return "职位名称："+name+"\n地址："+address+"\n薪资："+salary;
    }
}
