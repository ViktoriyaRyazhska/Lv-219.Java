package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.softserve.lv219.homework.*;
public class Test323 {
    Exercise323 ex=new Exercise323();
	@Before
	public void setUp() throws Exception {
		assertNotNull(ex);
	}

	@Test
	public void testPrintRelativlyPrimes() {
	
	}

	@Test
	public void testBCD() {
		assertEquals(1,ex.BCD(3, 7));
		assertEquals(1,ex.BCD(93, 2));
		assertEquals(1,ex.BCD(6, 13));
	}

}
