package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test.*;
import static org.testng.Assert.*;


import com.softserve.lv219.homework.Exercise86a;



public class Test86aTestNG {
    
    private  Exercise86a exercise;
    
  
    
    @BeforeTest
    public void setUp() 
    {
        exercise= new Exercise86a();
    }
    
    @Test(dataProvider= "data")
    public void testGetNumbersCount(int in, int out)
    {
        assertTrue(exercise.getNumbersCount(in)==out);
    }
    
    
    @DataProvider
    public Object[][] data() {
      return new Object[][] {
        new Object[] {123, 3 },
        new Object[] {-123, 3 },
        new Object[] { 0, 1 },
        new Object[] { 23334, 5 },
        new Object[] {11,2}
      };
    }

}
