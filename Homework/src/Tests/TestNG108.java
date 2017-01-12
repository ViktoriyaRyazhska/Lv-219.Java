package Tests;


import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.*;

import com.softserve.lv219.homework.Exercise108;

public class TestNG108 {
	
	static Exercise108 test108;
	
	@BeforeClass
	public void beforeClass() {
		test108 = new Exercise108();
	}
	
	@AfterClass
	public void afterClass() {
		test108 = null;
	}
	
	@Test(dataProvider = "calcPower")
	public void testCalcPower(TestCalcPower inputData, double expected) {
		double data = test108.calcPower(inputData.getInputedValue(), inputData.getPowerCounter());
		assertEquals(data, expected);
	}
	
	@Test(dataProvider = "guard")
	public void testGuard(TestGuard inputData, boolean expected) {
		boolean data = test108.guard(inputData.getValue());
		assertEquals(data, expected);
	}
	
	@DataProvider
	public Object[][] calcPower() {
		return new Object[][] {
			new Object[] { new TestCalcPower(5, 2), 2.4000000000000004 },
			new Object[] { new TestCalcPower(10, 3), 3.4000000000000004 },
			new Object[] { new TestCalcPower(0, 20), 20.0 },
			new Object[] { new TestCalcPower(18, 3), 4.2 },
			new Object[] { new TestCalcPower(4, 11), 11.0 }
		};
	}
	
	@DataProvider
	public Object[][] guard() {
		return new Object[][] {
			new Object[] { new TestGuard(3), true },
			new Object[] { new TestGuard(1), true },
			new Object[] { new TestGuard(0), false },
			new Object[] { new TestGuard(10), true },
			new Object[] { new TestGuard(-2), false }
		};
	}
	
	private static class TestCalcPower {
		private int inputedValue;
		private double powerCounter;
		
		public TestCalcPower(int inputedValue, double powerCounter) {
			this.inputedValue = inputedValue;
			this.powerCounter = powerCounter;
		}
		
		public int getInputedValue() {
			return inputedValue;
		}
		
		public double getPowerCounter() {
			return powerCounter;
		}		
	}
	
	private static class TestGuard {
		private int value;
		
		public TestGuard(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}		
	}
	
}
