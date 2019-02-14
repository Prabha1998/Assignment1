package com.personal.FindCheese;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheeseFinderTest {
    @Test
 public void checkPosition()
 {
     int space[][]={{1,1,1,1,1},
                    {0,0,1,0,1},
                    {0,0,9,0,1},
                    {0,1,0,0,1},
                    {1,1,1,1,1}};
     Assert.assertEquals(false,CheeseFinder.go(space,0,0,space.length-1,space[0].length-1));
 }
}