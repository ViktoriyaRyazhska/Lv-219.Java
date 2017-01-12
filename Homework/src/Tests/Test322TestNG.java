package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.softserve.lv219.homework.Exercise322;

public class Test322TestNG {
	static	Exercise322 ex322;
	
	  @Test(dataProvider = "dp")
	  public void testFindMaxIndex(int inputNumber, int expected) {
		  int actualResult = ex322.findMaxIndex(inputNumber);
		  assertEquals(actualResult, expected);	  
	  }

	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { 1, 1 },
	      new Object[] { 16, 12 },
	      new Object[] { 20,20  },
	      new Object[] { 15,12  }
	    };
	  }
	  @BeforeClass
	  public void beforeClass() {
		  ex322 = new Exercise322();
	  }

	  @AfterClass
	  public void afterClass() {
		  ex322 = null;
	  }
}
