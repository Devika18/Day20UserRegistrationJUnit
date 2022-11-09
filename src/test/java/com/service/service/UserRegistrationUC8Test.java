package com.service.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationUC8Test {
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

    @Test
    public void givenPassword_WithoutSpecialCharacter_ShouldReturnFalse() {
        boolean isNotValid = userRegistrationUC8.isValidPassword("GoodLuck987");
        Assert.assertFalse(isNotValid);
        System.out.println("Password is Not Valid");
        System.out.println(isNotValid);
    }
}
