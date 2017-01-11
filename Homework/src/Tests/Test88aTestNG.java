package Tests;

import org.testng.annotations.Test;

import com.softserve.lv219.homework.Exercise88a;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import static org.testng.Assert.*;

public class Test88aTestNG {
	static Exercise88a ex88a;

	@Test(dataProvider = "dpForPow",dependsOnMethods="testContainsDigit")
	public void testPow(TestPowData inputData, int expected) {
		int actualResult = ex88a.pow(inputData.getBase(), inputData.getExponent());
		assertEquals(actualResult, expected);
	}
	
	@Test(dataProvider = "dpForContainsDigit")
	public void testContainsDigit(TestContainsDigit inputData, boolean expected) {
		boolean actualResult = ex88a.containsDigit(inputData.getNumber(), inputData.getDigit());
		assertEquals(actualResult, expected);
	}

	@DataProvider
	public Object[][] dpForPow() {
		return new Object[][] {
				new Object[] { new TestPowData(1, 15), 1 },
				new Object[] { new TestPowData(2, 5), 32 },
				new Object[] { new TestPowData(3, 4), 81 },
				new Object[] { new TestPowData(4, 2), 16 }
				};
	}
	
	@DataProvider
	public Object[][] dpForContainsDigit() {
		return new Object[][] {
				new Object[] { new TestContainsDigit(0,1), false },
				new Object[] { new TestContainsDigit(1345,5), true },
				new Object[] { new TestContainsDigit(1345,1), true },
				new Object[] { new TestContainsDigit(12345789,6), false },
				};
	}

	@BeforeClass
	public void beforeClass() {
		ex88a = new Exercise88a();
	}

	@AfterClass
	public void afterClass() {
		ex88a = null;
	}



	private static class TestPowData {
		private int base;
		private int exponent;

		public TestPowData(int base, int exponent) {
			this.base = base;
			this.exponent = exponent;
		}

		public int getBase() {
			return base;
		}

		public int getExponent() {
			return exponent;
		}

	}
	
	private static class TestContainsDigit {
		private int number;
		private int digit;

		public TestContainsDigit(int number, int digit) {
			this.number = number;
			this.digit = digit;
		}

		public int getNumber() {
			return number;
		}

		public int getDigit() {
			return digit;
		}

		

	}
}
