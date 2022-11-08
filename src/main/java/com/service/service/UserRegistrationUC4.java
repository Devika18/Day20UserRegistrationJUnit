package com.service.service;

import java.util.regex.Pattern;

public class UserRegistrationUC4 {
    public static boolean isValidMobileNumber(String mobileNumber) {
        return Pattern.matches("^\\+(?:[0-9] ?){6,14}[0-9]$", mobileNumber);
    }

    public static boolean isInValidMobileNumber(String mobileNumber) {
        return Pattern.matches("^{6,14}[0-9]$", mobileNumber);
    }
}
