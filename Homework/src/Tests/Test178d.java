package test;

import static org.junit.Assert.*;

import com.softserve.lv219.homework.*;

import org.junit.Test;

public class Test178d {
	
	Exercise178d t = new Exercise178d();

	@Test
	public void test() {
		assertEquals(3,t.calc(4, 2));
		assertEquals(7,t.calc(10,4));
	}

}
