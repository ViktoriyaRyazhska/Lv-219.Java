package Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.softserve.lv219.homework.Exercise324;

public class Test324 {

	Exercise324 test;

	@Before
	public void setUp() throws Exception {
		test = new Exercise324();

	}

	@After
	public void tearDown() throws Exception {
		test = null;
	}

	@Test
	public void testGCDEvklid() {
		assertEquals(1, test.gcdEvklid(5, 7));
		assertEquals(6, test.gcdEvklid(6, 90));
		assertEquals(10, test.gcdEvklid(90, 10));

	}

}
