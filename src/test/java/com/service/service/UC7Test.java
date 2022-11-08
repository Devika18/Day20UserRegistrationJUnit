package com.service.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UC7Test {
    private UserRegistrationUC7 userRegistrationUC7;

    @Before
    public void setUp() throws Exception {
        userRegistrationUC7 = new UserRegistrationUC7();
    }

    @Test
    public void givenPassword_WhenContainedAtleast1Number_ShouldReturnTrue() {
        boolean isValid = userRegistrationUC7.isValidPassword("Goodluck9");
        Assert.assertTrue(isValid);
        System.out.println("Password is Valid");
        System.out.println(isValid);
    }

    @Test
    public void givenPassword_WithoutNumber_ShouldReturnFalse() {
        boolean isNotValid = userRegistrationUC7.isInValidPassword("GoodLuck");
        Assert.assertFalse(isNotValid);
        System.out.println("Password is Not Valid");
        System.out.println(isNotValid);

    }
}
