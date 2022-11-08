package com.service.service;

import java.util.regex.Pattern;

public class UserRegistrationUC5 {
    public static boolean isValidPassword(String password) {
        return Pattern.matches("[a-z]{8,}", password);
    }
}
