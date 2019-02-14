package com.personal.Pattern;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
    @Test
    public void testPattern()
    {
        Assert.assertEquals(true,Pattern.printPattern(4));
    }
}