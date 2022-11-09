package com.service.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationUC2Test {
    private UserRegistrationUC2 userRegistrationUC2;

    @Before
    public void setUp() throws Exception {
        userRegistrationUC2 = new UserRegistrationUC2();
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean isValid = userRegistrationUC2.isValidLastName("Karpe");
        Assert.assertTrue(isValid);
        System.out.println("Last Name is Valid");
        System.out.println(isValid);
    }

    @Test
    public void givenLastName_WhenFirstLetterIsNotCapital_ShouldReturnFalse() {
        boolean isNotValid = userRegistrationUC2.isValidLastName("karpe");
        Assert.assertFalse(isNotValid);
        System.out.println("Last Name is Not Valid");
        System.out.println(isNotValid);
    }

    @Test
    public void givenLastName_WhenNumberPresent_ShouldReturnFalse() {
        boolean isNotValid = userRegistrationUC2.isValidLastName("Karpe18");
        Assert.assertFalse(isNotValid);
        System.out.println("Last Name is Not Valid");
        System.out.println(isNotValid);
    }

    @Test
    public void givenLastName_WhenSpecialCharacterPresent_ShouldReturnFalse() {
        boolean isNotValid = userRegistrationUC2.isValidLastName("Karpe@");
        Assert.assertFalse(isNotValid);
        System.out.println("Last Name is Not Valid");
        System.out.println(isNotValid);
    }
}
