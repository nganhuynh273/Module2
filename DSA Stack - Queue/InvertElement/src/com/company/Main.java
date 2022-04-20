package com.company;

public class Main {
    public static void reverse(StringBuffer s) {
        int n = s.length();
        Stack object = new Stack(n);

        int i;
        for(i = 0; i < n; i++) {
            object.push(s.charAt(i));
        }

        for (i = 0; i < n; i++) {
            char ch = object.pop();
            s.setCharAt(i, ch);
        }
    }

    public static void main(String[] args) {
        StringBuffer s= new StringBuffer("MyLitteAries");

        reverse(s);

        System.out.println(s);
    }
}

