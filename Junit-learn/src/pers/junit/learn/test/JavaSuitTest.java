package pers.junit.learn.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CodeTest.class,TestDuanyan.class})
public class JavaSuitTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
