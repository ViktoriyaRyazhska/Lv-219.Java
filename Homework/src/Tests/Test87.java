package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.softserve.lv219.homework.*;
public class Test87 {
    Exercise87 ex=new Exercise87();
	@Before
	public void setUp() throws Exception {
		assertNotNull(ex);
	}

	@Test
	public void testSumOfDigits() {
		assertEquals(9,ex.sumOfDigits(354, 2));
		assertEquals(0,ex.sumOfDigits(21312, 0));
		assertEquals(6,ex.sumOfDigits(21312, 3));
	}

}
