package com.service.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UC6Test {
    private UserRegistrationUC6 userRegistrationUC6;

    @Before
    public void setUp() throws Exception {
        userRegistrationUC6 = new UserRegistrationUC6();
    }

    @Test
    public void givenPassword_withAtleasteOneUpperCase_ShouldReturnTrue() {
        boolean isValid = userRegistrationUC6.isValidPassword("Goodluck");
        Assert.assertTrue(isValid);
        System.out.println("Password is Valid");
        System.out.println(isValid);
    }
}
