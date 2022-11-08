package com.service.service;

import java.util.regex.Pattern;

public class UserRegistrationUC6 {
    public static boolean isValidPassword(String password) {
        return Pattern.matches("[A-Z][a-z]{7}", password);
    }
}
