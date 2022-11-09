package com.service.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationUC9Test {
    private UserRegistrationUC9 userRegistrationUC9;

    @Before
    public void setUp() throws Exception {
        userRegistrationUC9 = new UserRegistrationUC9();
    }

    @Test
    public void givenPassword_WhenProperFormat_ShouldReturnTrue() {
        boolean isValid = userRegistrationUC9.isValidPassword("xyz@co.in");
        Assert.assertTrue(isValid);
        System.out.println("Password is Valid");
        System.out.println(isValid);
    }

    @Test
    public void givenPassword_WhenNotProperFormat_ShouldReturnFalse() {
        boolean isNotValid = userRegistrationUC9.isValidPassword("abc123gmail.com");
        Assert.assertFalse(isNotValid);
        System.out.println("Password is Not Valid");
        System.out.println(isNotValid);
    }
}
