package com.rueggerllc.tests.unit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooTest {
	
	@BeforeMethod
	public void setup() {
		System.out.println("FooTest SETUP");
	}

	@Test
	// @Ignore
	public void testDummy() {
		System.out.println("Foo Dummy Test");
	}

}
