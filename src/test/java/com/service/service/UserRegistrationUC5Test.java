package com.service.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationUC5Test {
    private UserRegistrationUC5 userRegistrationUC5;

    @Before
    public void setUp() throws Exception {
        userRegistrationUC5 = new UserRegistrationUC5();
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean isValid = userRegistrationUC5.isValidPassword("goodluck");
        Assert.assertTrue(isValid);
        System.out.println("Paasword is Valid");
        System.out.println(isValid);
    }

    @Test
    public void givenPassword_WhenContainedLessThan8Letters_ShouldReturnFalse() {
        boolean isNotValid = userRegistrationUC5.isValidPassword("good");
        Assert.assertFalse(isNotValid);
        System.out.println("Paasword is Valid");
        System.out.println(isNotValid);
    }
}
