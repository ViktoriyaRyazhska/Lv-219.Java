package Tests;

import org.junit.Before;
import org.junit.Test;

import com.softserve.lv219.homework.*;

import junit.framework.Assert;

public class Test88b {
    
    private Exercise88b  exercise;
    
    
    @Before
    public void setUp() throws Exception
    {
        exercise =new Exercise88b();
    }
    
    @Test
    
    public void Testreverse()
    {
        Assert.assertTrue(exercise.reverse(123)==321);
        Assert.assertTrue(exercise.reverse(5)==5);
        Assert.assertTrue(exercise.reverse(-244)==-442);
    }
    
    

}
