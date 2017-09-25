package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction jUnitString=new jUnitFunction();
		String result=jUnitString.addstrings("capstoe","project");
		assertEquals("capstoeproject",result);
		
	}

}
