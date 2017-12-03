package pers.onezero.songoh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.onezero.output.OutputHelper;

public class Test {
     public static void main(String[] args){
    	 ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"Songouhe.xml"});
    	 OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	 output.generateOutput();
     }
}
