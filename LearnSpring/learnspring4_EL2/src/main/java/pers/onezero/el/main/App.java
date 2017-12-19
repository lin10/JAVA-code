package pers.onezero.el.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pers.onezero.el.comel.JobEl;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beanConfig.xml"});
        JobEl job = (JobEl)context.getBean("jobBean"); 
        System.out.println(job);
        ((AbstractApplicationContext) context).close();
	}

}
