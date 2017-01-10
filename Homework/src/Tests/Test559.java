package Tests;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Before;
import org.junit.Test;
import com.softserve.lv219.homework.*;
public class Test559 {
    Exercise559 ex=new Exercise559(); 
	@Before
	public void setUp() throws Exception {
		assertNotNull(ex);
	}

	@Test
	public void testGetMersieneNumbers() {
		assertNotNull(ex.getMersieneNumbers(5));
		List<Integer> mers=new ArrayList<Integer>();
		mers.add(1);
		assertEquals(mers,ex.getMersieneNumbers(2));
	}

	@Test
	public void testIsSimple() {
		assertEquals(true,ex.isSimple(2));
		assertEquals(true,ex.isSimple(3));
		assertEquals(true,ex.isSimple(17));
		assertEquals(true,ex.isSimple(1));
	}

}
