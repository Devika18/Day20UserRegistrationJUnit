package com.service.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationUC11Test {
    private UserRegistrationUC11 userRegistrationUC11;

    @Before
    public void setUp() throws Exception {
        userRegistrationUC11 = new UserRegistrationUC11();
    }

    @Test
    public void givenMultipleEmails_WhenProper_ShouldReturnTrue() {
        boolean isValidMail1 = userRegistrationUC11.validateMultipleEmails("abc-100@yahoo.com,");
        Assert.assertTrue(isValidMail1);
        System.out.println(isValidMail1);
        boolean isValidMail2 = userRegistrationUC11.validateMultipleEmails("abc@yahoo.com,");
        Assert.assertTrue(isValidMail2);
        System.out.println(isValidMail2);
        boolean isValidMail3 = userRegistrationUC11.validateMultipleEmails("abc.101@yahoo.com,");
        Assert.assertTrue(isValidMail3);
        System.out.println(isValidMail3);
        boolean isValidMail4 = userRegistrationUC11.validateMultipleEmails("abc111@abc.com,");
        Assert.assertTrue(isValidMail4);
        System.out.println(isValidMail4);
        boolean isValidMail5 = userRegistrationUC11.validateMultipleEmails("abc@gmail.com.com,");
        Assert.assertTrue(isValidMail5);
        System.out.println(isValidMail5);
    }

    @Test
    public void givenMultipleEmails_WhenNotProper_ShouldReturnFalse() {
        boolean isInValidMail1 = userRegistrationUC11.validateMultipleEmails("abc-100yahoo.com,");
        Assert.assertFalse(isInValidMail1);
        System.out.println(isInValidMail1);
        boolean isInValidMail2 = userRegistrationUC11.validateMultipleEmails("xyzgmail.com");
        Assert.assertFalse(isInValidMail2);
        System.out.println(isInValidMail2);
        boolean isInValidMail3 = userRegistrationUC11.validateMultipleEmails("100-xyz.com,@");
        Assert.assertFalse(isInValidMail3);
        System.out.println(isInValidMail3);
        boolean isInValidMail4 = userRegistrationUC11.validateMultipleEmails("56abcabc.com,");
        Assert.assertFalse(isInValidMail4);
        System.out.println(isInValidMail4);
        boolean isInValidMail5 = userRegistrationUC11.validateMultipleEmails("lmnyahoo.com.in");
        Assert.assertFalse(isInValidMail5);
        System.out.println(isInValidMail5);
    }
}
