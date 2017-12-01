package pers.junit.learn.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
import pers.junit.learn.test.*;
import org.junit.rules.TestName;
import org.junit.Rule;

public class CodeTest {
    Code code = new Code();
    String[] str2 = {"java","php","Python"};
	@Test
	public void test() {
		System.out.println("测试：");
		assertArrayEquals(str2, code.codeList());
	}
	
/**	下方操作方便获知测试的方法名   **/
	@Rule
	public TestName name = new TestName();
	
	@Test
	public void  test1(){
		System.out.println(name.getMethodName());
//		System.out.println(name.getClass());
		assertEquals("test1",name.getMethodName());
	}
/**下方测试由方法抛出的异常,方法抛出ArithmeticException异常则测试通过，这是在测试预期的异常。如果去掉(expected = ArithmeticException.class)则会报错**/
	@Test(expected = ArithmeticException.class)
	public void divisionWithExceprion(){
		int i = 1/0;
	}
/**超时测试，测试Junit测试是否超时，是否超过设定的毫秒数**/
	@Ignore
	@Test(timeout = 1000)
	public void time(){
		while(true);
	}
}  
