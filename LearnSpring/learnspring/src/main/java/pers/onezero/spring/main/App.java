package pers.onezero.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	
	static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	
    	logger.debug("测试日志");
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Hello10 obj = (Hello10) context.getBean("helloID");
    	obj.printName(); 
    }
    
}
