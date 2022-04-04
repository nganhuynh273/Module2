package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PhoneExample = "\\(84\\)-\\(\\d{10}\\)";
    public PhoneExample() {
        pattern = Pattern.compile(PhoneExample);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();

    }

}
