package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
        private static Pattern pattern;
        private Matcher matcher;
    private static final String ClassExample =   "^[CAP]+\\d{4}+[GHIKLM]";
    public ClassExample() {
        pattern = Pattern.compile(ClassExample);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

