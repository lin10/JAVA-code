package pers.onezero.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;
import pers.onezero.qiyi.Job;

public class Qiyimain {
	    Logger logger = Logger.getLogger(Qiyimain.class);
	public static void main(String[] args){
		ApplicationContext context =new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		Job job = (Job) context.getBean("JobBean");
		System.out.println(job);
	}
}
