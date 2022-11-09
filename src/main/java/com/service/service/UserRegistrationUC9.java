package com.service.service;

import java.util.regex.Pattern;

public class UserRegistrationUC9 {
    public static boolean isValidPassword(String password) {
        return Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.,-]+$", password);
    }
}
