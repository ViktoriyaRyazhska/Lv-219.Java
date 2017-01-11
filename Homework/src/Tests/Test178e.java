package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import com.softserve.lv219.homework.Exercise178e;

public class Test178e {
	
	Exercise178e t = new Exercise178e();

	@Test
	public void test() {
		assertEquals(30,t.mul(10, 3));
		assertEquals(20,t.mul(5, 4));
	}

}
