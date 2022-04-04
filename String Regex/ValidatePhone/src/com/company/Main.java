package com.company;

public class Main {
private static PhoneExample phoneExample;
public static  final String[] validPhone = new String[] {"(84)-(0978489648)"};
    public static final String[] invalidPhone = new String[] {"(a8)-(22222222)"};
    public static void main(String[] args) {
        phoneExample = new PhoneExample();
        for (String Phone : validPhone) {
            boolean isvalid = phoneExample.validate(Phone);
            System.out.println("Phone is " + Phone + "is valid: " + isvalid);
        }
        for (String Phone : invalidPhone) {
            boolean isvalid = phoneExample.validate(Phone);
            System.out.println("Phone is " + Phone + " is valid: "+ isvalid);
        }
    }
    }
