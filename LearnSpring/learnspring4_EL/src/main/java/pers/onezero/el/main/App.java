package pers.onezero.el.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.onezero.el.com.Programmer;
import pers.onezero.el.comel.ProgrammerEl;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beanConfig.xml"});
        Programmer program = (Programmer)context.getBean("proBean");
        System.out.println(program);
        ProgrammerEl programel = (ProgrammerEl)context.getBean("proBeanEl"); 
        System.out.println(programel);
        ((AbstractApplicationContext) context).close();
	}

}
