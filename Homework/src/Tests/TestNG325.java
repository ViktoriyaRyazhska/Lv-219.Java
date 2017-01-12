package Tests;

import org.testng.annotations.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.*;

import com.softserve.lv219.homework.Exercise325;

public class TestNG325 {
	
	static Exercise325 test325;
	
	@BeforeClass
	public void beforeClass() {
		test325 = new Exercise325();
	}
	
	@AfterClass
	public void afterClass() {
		test325 = null;
	}
	
	@Test(dataProvider = "check")
	public void testCheck(TestCheck inputData, boolean expected) {
		boolean data = test325.check(inputData.getValue());
		assertEquals(data, expected);
	}
	
	@DataProvider
	public Object[][] check() {
		return new Object[][] {
			new Object[] { new TestCheck(3), true },
			new Object[] { new TestCheck(1), true },
			new Object[] { new TestCheck(0), false },
			new Object[] { new TestCheck(10), true },
			new Object[] { new TestCheck(-2), false }
		};
	}
	
	private static class TestCheck {
		private int value;
		
		public TestCheck(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}		
	}
	
}
