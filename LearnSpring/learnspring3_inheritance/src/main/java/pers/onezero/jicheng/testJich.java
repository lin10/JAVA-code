package pers.onezero.jicheng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class testJich {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"BeanConfig.xml"});
		/*正常继承，父本可以实例化*/
		ozJich jicheng = (ozJich)context.getBean("ozdatajc");
		jicheng.printJich();
		
		/*继承抽象，基础模板不能实例化*/
		ozJich jich = (ozJich)context.getBean("ozdatajcAb");
		jich.printJich();
		
		/*纯继承模板，目的是实现相同属性共享*/
		ozJich chunjc = (ozJich)context.getBean("ozdatajcChun");
		chunjc.printJich();
		/*以上三种子bean可以覆盖模板*/
		/*Spring bean配置继承是为了避免多个Bean有重复共同的值或配置是非常有用的。*/
		((AbstractApplicationContext) context).close();
	}         
}
