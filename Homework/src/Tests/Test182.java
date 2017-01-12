package Tests;


import static org.junit.Assert.*;

import org.junit.Test;

import com.softserve.lv219.homework.Exercise182;


public class Test182 {
	
	Exercise182 ex182 = new Exercise182();
	
	@Test
	public void shouldCalculateSum() {
		ex182.suitableNumbers.add(45);
		ex182.suitableNumbers.add(15);
		assertEquals(60, ex182.sum(ex182.suitableNumbers));
		
		ex182.suitableNumbers.clear();
		ex182.suitableNumbers.add(100);
		ex182.suitableNumbers.add(25);
		assertEquals(125, ex182.sum(ex182.suitableNumbers));
	}
}
