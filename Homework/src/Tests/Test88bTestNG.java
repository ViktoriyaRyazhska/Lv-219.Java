package Tests;

import org.testng.annotations.Test;

import com.softserve.lv219.homework.Exercise88b;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import static org.testng.Assert.*;

public class Test88bTestNG {
	static	Exercise88b ex88b;
	
  @Test(dataProvider = "dp")
  public void testReverce(int inputNumber, int expected) {
	  int actualResult = ex88b.reverse(inputNumber);
	  assertEquals(actualResult, expected);	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 5, 5 },
      new Object[] { 23, 32 },
      new Object[] { 12345, 54321 },
      new Object[] { 912129, 921219 }
    };
  }
  @BeforeClass
  public void beforeClass() {
	  ex88b = new Exercise88b();
  }

  @AfterClass
  public void afterClass() {
	  ex88b = null;
  }

}
