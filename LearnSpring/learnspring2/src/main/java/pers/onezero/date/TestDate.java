package pers.onezero.date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.onezero.date.DateConfig;

public class TestDate {
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"Date.xml"});
        DateConfig dateconfig = (DateConfig) context.getBean("dateTest");
        System.out.println(dateconfig);
	}
            
}
