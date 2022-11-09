package com.service.service;

import java.util.regex.Pattern;

public class UserRegistartionUC10 {
    public static boolean isValidFirstName(String firstName) {
        return Pattern.matches("[A-Z][a-z]{2,}", firstName);
    }

    public static boolean isValidLastName(String lastName) {
        return Pattern.matches("[A-Z][a-z]{2,}", lastName);
    }

    public static boolean isValidEmail(String email) {
        return Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email);
    }

    public static boolean isValidMobileNumber(String mobileNumber) {
        return Pattern.matches("[91]{2}[ ][0-9]{10}", mobileNumber);
    }

    public static boolean isPasswordValidate(String password) {
        return Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()-[{}]:;',?/*~$^+=<>]).{8,20}$", password);
    }

    public static boolean isCombinedAllMails(String mailId) {
        return Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.,-]+$", mailId);
    }
}
