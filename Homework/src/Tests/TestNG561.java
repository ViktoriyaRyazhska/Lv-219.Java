package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.*;

import com.softserve.lv219.homework.Exercise561;

public class TestNG561 {
  
static Exercise561 test561;
	
	@BeforeClass
	public void beforeClass() {
		test561 = new Exercise561();
	}
	
	@AfterClass
	public void afterClass() {
		test561 = null;
	}
	
	@Test(dataProvider = "checkValue")
	public void testCheckValue(TestCheckValue inputData, boolean expected) {
		boolean data = test561.checkValue(inputData.getValue());
		assertEquals(data, expected);
	}
	
	@DataProvider
	public Object[][] checkValue() {
		return new Object[][] {
			new Object[] { new TestCheckValue(6), true },
			new Object[] { new TestCheckValue(4), true },
			new Object[] { new TestCheckValue(0), false },
			new Object[] { new TestCheckValue(-1), false },
			new Object[] { new TestCheckValue(2), true }
		};
	}
	
	private static class TestCheckValue {
		private int value;
		
		public TestCheckValue(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}		
	}
}
