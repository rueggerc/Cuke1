package com.rueggerllc.tests.unit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.rueggerllc.cuke.service.Bar;

public class BarTest {
	
	@BeforeClass
	public static void setupClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setupTest() throws Exception {
	}

	@After
	public void tearDownTest() throws Exception {
	}

	@Test
	// @Ignore
	public void testBar() {
		Bar bar = new Bar();
		bar.doIt(33);
	}

}
