package com.service.service;

import java.util.regex.Pattern;

public class UserRegistrationUC3 {
    public static boolean isValidEmail(String email) {
        return Pattern.matches("^[a-z0-9+_.-]+@[a-z0-9.-]+$", email);
    }
}
