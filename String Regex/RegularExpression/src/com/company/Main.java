package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
        private static ClassExample classExample;
        public static final String[] validClass = new String[] {"C0318G"};
        public static final String[] invalidClass = new String[] { "M0318G", "P0323A"};

        public static void main(String args[]) {
            classExample = new ClassExample();
            for (String Class : validClass) {
                boolean isvalid = classExample.validate(Class);
                System.out.println("Class is " + Class + "is valid: " + isvalid);
            }
            for (String Class : invalidClass) {
                boolean isvalid = classExample.validate(Class);
                System.out.println("Class is " + Class + " is valid: "+ isvalid);
            }
        }
    }
