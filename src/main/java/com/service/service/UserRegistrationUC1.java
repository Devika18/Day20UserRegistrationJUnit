package com.service.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC1 {
    public static boolean isValidFirstName(String firstName) {
        return Pattern.matches("[A-Z][a-z]{2,}", firstName);
    }
}
