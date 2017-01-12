package Tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test.*;
import static org.testng.Assert.*;


import com.softserve.lv219.homework.Exercise86b;

public class Test86bTestNg {
    
    
    private  Exercise86b exercise;
    
    
    @BeforeTest
    public void setUp() 
    {
        exercise= new Exercise86b();
    }
    
    @Test(dataProvider= "data")
    public void testGetNumbersCount(int in, int out)
    {
        assertEquals(exercise.getSumOfDigits(in),out);
    }
    
    
    @DataProvider
    public Object[][] data() {
      return new Object[][] {
        new Object[] {123, 6 },
        new Object[] {0, 0 },
        new Object[] { -1, -1 },
        new Object[] { -22, 0 },
        new Object[] {111,3}
      };
    }

}
