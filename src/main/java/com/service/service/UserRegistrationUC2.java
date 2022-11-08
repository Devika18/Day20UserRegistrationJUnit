package com.service.service;

import java.util.regex.Pattern;

public class UserRegistrationUC2 {
    public static boolean isValidLastName(String lastName) {
        return Pattern.matches("[A-Z][a-z]{2,}", lastName);
    }
}
