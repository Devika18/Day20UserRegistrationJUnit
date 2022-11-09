package com.service.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationUC10Test {
    private UserRegistartionUC10 userRegistartionUC10;

    @Before
    public void setUp() throws Exception {
        userRegistartionUC10 = new UserRegistartionUC10();
    }

    @Test
    public void givenUserDetails_WhenProper_ShouldBeHappy() {
        boolean isValidFName = userRegistartionUC10.isValidFirstName("Devika");
        Assert.assertTrue(isValidFName);
        System.out.println("I am Happy");
        boolean isValidLName = userRegistartionUC10.isValidLastName("Karpe");
        Assert.assertTrue(isValidLName);
        System.out.println("I am Happy");
        boolean isValidMail = userRegistartionUC10.isValidEmail("devikak18@rediffmail.com");
        Assert.assertTrue(isValidMail);
        System.out.println("I am Happy");
        boolean isValidPhone = userRegistartionUC10.isValidMobileNumber("91 1234567890");
        Assert.assertTrue(isValidPhone);
        System.out.println("I am Happy");
        boolean isValidPass = userRegistartionUC10.isPasswordValidate("Abcxyz@18");
        Assert.assertTrue(isValidPass);
        System.out.println("I am Happy");
        boolean isValidAllMails = userRegistartionUC10.isCombinedAllMails("abc-2022@yahoo.com");
        Assert.assertTrue(isValidAllMails);
        System.out.println("I am Happy");
    }

    @Test
    public void givenUsrDetails_WhenNotProper_ShouldBeSad() {
        boolean isNotValidFName = userRegistartionUC10.isValidFirstName("devika");
        Assert.assertFalse(isNotValidFName);
        System.out.println("I am Sad");
        boolean isNotValidLName = userRegistartionUC10.isValidLastName("karpe");
        Assert.assertFalse(isNotValidLName);
        System.out.println("I am Sad");
        boolean isNotValidMail = userRegistartionUC10.isValidEmail("devikakrediffmail.com");
        Assert.assertFalse(isNotValidMail);
        System.out.println("I am Sad");
        boolean isNotValidPhone = userRegistartionUC10.isValidMobileNumber("1234567890");
        Assert.assertFalse(isNotValidPhone);
        System.out.println("I am Sad");
        boolean isNotValidPass = userRegistartionUC10.isPasswordValidate("abc@18");
        Assert.assertFalse(isNotValidPass);
        System.out.println("I am Sad");
        boolean isNotValidAllMails = userRegistartionUC10.isCombinedAllMails("abcyahoo");
        Assert.assertFalse(isNotValidAllMails);
        System.out.println("I am Sad");
    }
}
