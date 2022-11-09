package com.service.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationUC10Test {
    private UserRegistrationUC10 userRegistrationUC10;

    @Before
    public void setUp() throws Exception {
        userRegistrationUC10 = new UserRegistrationUC10();
    }

    @Test
    public void givenUserDetails_WhenProper_ShouldBeHappy() {
        boolean isValidFName = userRegistrationUC10.isValidFirstName("Devika");
        Assert.assertTrue(isValidFName);
        System.out.println("I am Haapy");
        boolean isValidLName = userRegistrationUC10.isValidLastName("Karpe");
        Assert.assertTrue(isValidLName);
        System.out.println("I am Happy");
        boolean isValidMail = userRegistrationUC10.isValidEmail("devikak09@rediffmail.com");
        Assert.assertTrue(isValidMail);
        System.out.println("I am Happy");
        boolean isValidPhone = userRegistrationUC10.isValidMobileNumber("91 1234567890");
        Assert.assertTrue(isValidPhone);
        System.out.println("I am Happy");
        boolean isValidPass = userRegistrationUC10.isPasswordIsValidate("Abc@1315");
        Assert.assertTrue(isValidPass);
        System.out.println("I am Happy");
        boolean isValidAllMails = userRegistrationUC10.isCombinedAllMails("xyz@yahoo.com");
        Assert.assertTrue(isValidAllMails);
        System.out.println("I am Happy");
    }

    @Test
    public void givenUserDetails_WhenNotProper_ShouldBeSad() {
        boolean isNotValidFName = userRegistrationUC10.isValidFirstName("devika");
        Assert.assertFalse(isNotValidFName);
        System.out.println("I am Sad");
        boolean isNotValidLName = userRegistrationUC10.isValidLastName("karpe");
        Assert.assertFalse(isNotValidLName);
        System.out.println("I am Sad");
        boolean isNotValidMail = userRegistrationUC10.isValidEmail("devikakrediffmail");
        Assert.assertFalse(isNotValidMail);
        System.out.println("I am Sad");
        boolean isNotValidPhone = userRegistrationUC10.isValidMobileNumber("1234567890");
        Assert.assertFalse(isNotValidPhone);
        System.out.println("I am Sad");
        boolean isNotValidPass = userRegistrationUC10.isPasswordIsValidate("Abc1315");
        Assert.assertFalse(isNotValidPass);
        System.out.println("I am Sad");
        boolean isNotValidAllMails = userRegistrationUC10.isCombinedAllMails("xyzcom");
        Assert.assertFalse(isNotValidAllMails);
        System.out.println("I am Sad");
    }
}
