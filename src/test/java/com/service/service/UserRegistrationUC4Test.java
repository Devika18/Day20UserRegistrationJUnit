package com.service.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationUC4Test {
    private UserRegistrationUC4 userRegistrationUC4;

    @Before
    public void setUp() throws Exception {
        userRegistrationUC4 = new UserRegistrationUC4();
    }

    @Test
    public void givenMobileNumber_WhenProper_WithCountryCode_ShouldReturnTrue() {
        boolean isValid = userRegistrationUC4.isValidMobileNumber("+91 1122334455");
        Assert.assertTrue(isValid);
        System.out.println("Mobile Number is Valid");
        System.out.println(isValid);
    }

    @Test
    public void givenMobileNumber_WithoutCountryCode_ShouldReturnFalse() {
        boolean isNotValid1 = userRegistrationUC4.isInValidMobileNumber("1122334455");
        Assert.assertFalse(isNotValid1);
        System.out.println("Mobile Number is Not Valid");
        System.out.println(isNotValid1);
    }

    @Test
    public void givenMobileNumber_WhenIncludeSpecialCharacter_ShouldReturnFalse() {
        boolean isNotValid = userRegistrationUC4.isValidMobileNumber("+91 ^1122334455");
        Assert.assertFalse(isNotValid);
        System.out.println("Mobile Number is Not Valid");
        System.out.println(isNotValid);
    }
}
