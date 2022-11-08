package com.service.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UC3Test {
    private UserRegistrationUC3 userRegistrationUC3;

    @Before
    public void setUp() throws Exception {
        userRegistrationUC3 = new UserRegistrationUC3();
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean isValid;
        isValid = userRegistrationUC3.isValidEmail("devika18@gmail.com");
        Assert.assertTrue(isValid);
        System.out.println("Emails are Valid");
        System.out.println(isValid);
        isValid = userRegistrationUC3.isValidEmail("devika_18@yahoo.com");
        Assert.assertTrue(isValid);
        System.out.println("Emails are Valid");
        System.out.println(isValid);
        isValid = userRegistrationUC3.isValidEmail("devika18@co.in");
        Assert.assertTrue(isValid);
        System.out.println("Emails are Valid");
        System.out.println(isValid);
        isValid = userRegistrationUC3.isValidEmail("devika18@rediffmail.com");
        Assert.assertTrue(isValid);
        System.out.println("Emails are Valid");
        System.out.println(isValid);
    }

    @Test
    public void givenEmail_WhenInProper_ShouldReturnFalse() {
        boolean isNotValid;
        isNotValid = userRegistrationUC3.isValidEmail("Devi18@gmail.com");
        Assert.assertFalse(isNotValid);
        System.out.println("Email is Not Valid");
        System.out.println(isNotValid);
        isNotValid = userRegistrationUC3.isValidEmail("devikagmailcom");
        Assert.assertFalse(isNotValid);
        System.out.println("Email is Not Valid");
        System.out.println(isNotValid);
    }

    @Test
    public void givenEmail_WhenContainedOtherSpecialCharacter_ShouldReturnFalse() {
        boolean isNotValid = userRegistrationUC3.isValidEmail("devi18$gmail.com");
        Assert.assertFalse(isNotValid);
        System.out.println("Email is Not Valid");
        System.out.println(isNotValid);
    }
}
