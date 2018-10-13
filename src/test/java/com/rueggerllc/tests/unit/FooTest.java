package com.rueggerllc.tests.unit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rueggerllc.cuke.service.Foo;

import org.testng.Assert;

public class FooTest {
	
	@BeforeMethod
	public void setup() {
		System.out.println("FooTest SETUP");
	}


	
	@Test
	// @Ignore
	public void testFoo() {
		Foo foo = new Foo();
		foo.execute();
		foo.anotherMethod();
	}
	
	@Test
	public void whenEmptyString_thenAccept() {
	    Foo foo = new Foo();
	    Assert.assertTrue(foo.isPalindrome(""));
	    Assert.assertTrue(foo.isPalindrome("radar"));
	}
	
	@Test
	public void testYetAnotherMethod() {
	    Foo foo = new Foo();
	    foo.yetAnotherMethod();
	}

}
