package pers.junit.learn.test;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestDuanyan {
    @Test
    public void TestDuanyan(){
    	String str1 = "onezero";
    	String str2 = "onezero";
    	String str3 = "www.onezero.cc";
    	String str4 = null;
    	int[] arr1 = {1,0,10};
    	int[] arr2 = {1,0,10};
        char[] arr3 = {'o','z'};
        char[] arr4 = {'o','z'};
    	assertEquals(str1,str2);
    	assertTrue(10 == 10);
    	assertFalse(1 == 2);
    	assertNotNull(str3);
    	assertNull(str4);
    	assertSame(str1,str2);
    	assertNotSame(str2,str3);
    	assertArrayEquals(arr1,arr2);
    	assertArrayEquals(arr3,arr4);
    }
}
