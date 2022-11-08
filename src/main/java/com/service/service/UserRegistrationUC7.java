package com.service.service;

import java.util.regex.Pattern;

public class UserRegistrationUC7 {
    public static boolean isValidPassword(String password) {
        return Pattern.matches("[A-Z][a-z]{5,}[0-9]{1,}", password);
    }

    public static boolean isInValidPassword(String password1) {
        return Pattern.matches("[A-Z][a-z]{5,}", password1);
    }
}
