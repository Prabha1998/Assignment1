package com.personal.Pallindrome;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPallindromeTest {
    @Test
    public void isPallindromeTestRight()
    {
        Assert.assertEquals(true,CheckPallindrome.isPallindrome("aaaxx"));
    }
}