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
		System.out.println("���ԣ�");
		assertArrayEquals(str2, code.codeList());
	}
	
/**	�·����������֪���Եķ�����   **/
	@Rule
	public TestName name = new TestName();
	
	@Test
	public void  test1(){
		System.out.println(name.getMethodName());
//		System.out.println(name.getClass());
		assertEquals("test1",name.getMethodName());
	}
/**�·������ɷ����׳����쳣,�����׳�ArithmeticException�쳣�����ͨ���������ڲ���Ԥ�ڵ��쳣�����ȥ��(expected = ArithmeticException.class)��ᱨ��**/
	@Test(expected = ArithmeticException.class)
	public void divisionWithExceprion(){
		int i = 1/0;
	}
/**��ʱ���ԣ�����Junit�����Ƿ�ʱ���Ƿ񳬹��趨�ĺ�����**/
	@Ignore
	@Test(timeout = 1000)
	public void time(){
		while(true);
	}
}  
