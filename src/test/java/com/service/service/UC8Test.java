package com.service.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UC8Test {
    private UserRegistrationUC8 userRegistrationUC8;

    @Before
    public void setUp() throws Exception {
        userRegistrationUC8 = new UserRegistrationUC8();
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean isValid = userRegistrationUC8.isValidPassword("GoodLuck@9");
        Assert.assertTrue(isValid);
        System.out.println("Password is Valid");
        System.out.println(isValid);
    }
}
