package pers.junit.learn.test;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
public class GetSumTest {
	GetSum getSum = new GetSum();
	int sum = getSum.sum(6, 7);
	int testsum = 13;
	
	@Test
	public void testSum(){
		System.out.println("±È½Ï: "+sum+"&"+testsum);
		assertEquals(sum,testsum);
	}
}
