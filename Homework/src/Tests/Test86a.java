package Tests;

import org.junit.Before;
import org.junit.Test;

import com.softserve.lv219.homework.*;

import junit.framework.Assert;




public class Test86a {
    
    private Exercise86a  exercise;
    
    
    @Before
    public void setUp() throws Exception
    {
        exercise =new Exercise86a();
    }
    
    
    @Test
    public void TestgetNumbersCount()
    {
        Assert.assertTrue(exercise.getNumbersCount(123)==3);
        Assert.assertTrue(exercise.getNumbersCount(-123)==3);
        Assert.assertTrue(exercise.getNumbersCount(1200)==4);
        Assert.assertTrue(exercise.getNumbersCount(0)==1);
    }

}
