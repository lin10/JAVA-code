package pers.junit.learn.test;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(value = Parameterized.class)
public class GetSumTest {
	private int numA;
	private int numB;
	private int expected;

	public GetSumTest(int numA, int numB, int expected){
	      this.numA = numA;	
		  this.numB = numB;
		  this.expected = expected;
	}
	
//	GetSum getSum = new GetSum();
//	int sum = getSum.sum(6, 7);
//	int testsum = 13;
//	
//	@Test
//	public void testSum(){
//		System.out.println("±È½Ï: "+sum+"&"+testsum);
//		assertEquals(sum,testsum);
//	}
	
	@Parameters(name = "{index}: sum({0}+{1}) = {2}")
	public static Iterable<Object[]> canshu(){
		return Arrays.asList(new Object[][]{
			{1,2,3},
			{3,4,7},
			{3,7,10}
		});
	}
	@Test
	public void test_sum(){
		assertEquals(expected,GetSum.sum(numA,numB));
	}
	
}
