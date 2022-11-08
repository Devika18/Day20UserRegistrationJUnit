package com.service.service;

import java.util.regex.Pattern;

public class UserRegistrationUC8 {
    public static boolean isValidPassword(String password) {
        return Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()-[{}]:;',?/*~$^+=<>]).{8,20}$", password);
    }
}
