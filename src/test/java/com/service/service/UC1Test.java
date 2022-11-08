package com.service.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UC1Test {
    private UserRegistrationUC1 userRegistrationUC1;
    @Before
    public void setUp() throws Exception {
        userRegistrationUC1 = new UserRegistrationUC1();
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean isValid = userRegistrationUC1.isValidFirstName("Devika");
        Assert.assertTrue(isValid);
        System.out.println("Name is Valid");
        System.out.println(isValid);
    }

    @Test
    public void givenFirstName_WhenFirstLetterIsCapital_ShouldReturnFalse() {
        boolean isNotValid = userRegistrationUC1.isValidFirstName("devika");
        Assert.assertFalse(isNotValid);
        System.out.println("Name is Not Valid");
        System.out.println(isNotValid);
    }

    @Test
    public void givenFirstName_WhenNumberPresent_ShouldRetuenFalse() {
        boolean isNotValid = userRegistrationUC1.isValidFirstName("devika18");
        Assert.assertFalse(isNotValid);
        System.out.println("Name is Not Valid");
        System.out.println(isNotValid);
    }

    @Test
    public void givenFirstName_WhenSpecialCharacterPresent_ShouldReturnFasle() {
        boolean isNotValid = userRegistrationUC1.isValidFirstName("^devika^");
        Assert.assertFalse(isNotValid);
        System.out.println("Name is Not Valid");
        System.out.println(isNotValid);
    }
}
