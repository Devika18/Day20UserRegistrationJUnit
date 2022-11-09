package com.service.service;

import java.util.regex.Pattern;

public class UserRegistrationUC11 {
    public static boolean validateMultipleEmails(String EmailId) {
        return Pattern.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.,-]+", EmailId);
    }
}
