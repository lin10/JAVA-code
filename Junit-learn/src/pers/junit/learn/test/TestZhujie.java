package pers.junit.learn.test;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class TestZhujie {
	GetSum getSum = new GetSum();
    
    @Test
	public void TestSum_1(){
    	int sum1 = getSum.sum(1,3);
        int sum1test = 4;
		System.out.println("@Test: "+sum1+"&"+sum1test);
		assertEquals(sum1,sum1test);
	}
	@Test
	public void TestSum_2(){
		int sum2 = getSum.sum(7,6);
		int sum2test = 13;
		System.out.println("@Test£º"+sum2+"&"+sum2test);
		assertEquals(sum2,sum2test);
	}
    @Before
    public void beforeTest(){
    	System.out.println("@Before: ----------------");
    }
    @BeforeClass
    public static void beforeclassTest(){
    	System.out.println("@BeforeClass: ----------------");
    }
    @After
    public void afterTest(){
    	System.out.println("@After: -----------------");
    }
    @AfterClass
    public static void afterclassTest(){
    	System.out.println("@AfterClass: ------------------");
    }
	@Ignore
	public void ignoreTest(){
		System.out.println("@Ignore: ----------------------");
	}

	
	
}
