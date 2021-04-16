package com.luxfacta;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {
    Palindrome palindrome;

    @Before
    public void init() {
        palindrome = new Palindrome();
    }

    @Test
    public void isPalindromeUpperCaseTest() {
        Assert.assertTrue(palindrome.isPalindrome("ATA"));
    }

    @Test
    public void isPalindromeLowerCaseTest() {
        Assert.assertTrue(palindrome.isPalindrome("kaiak"));
    }

    @Test
    public void isPalindromeIgnoreCaseTest() {
        Assert.assertTrue(palindrome.isPalindrome("ArARa"));
    }

    @Test
    public void isNotPalindromeTest() {
        Assert.assertFalse(palindrome.isPalindrome("Luxfacta"));
    }
}
