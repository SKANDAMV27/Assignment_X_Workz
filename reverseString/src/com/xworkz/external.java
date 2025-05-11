package com.xworkz;

public class external {
    public static void main(String[] args) {
        String name = "SKANDA";
        String reverse = reverseString(name);
        System.out.println("Original String: " + name);
        System.out.println("Reverse String: " + reverse);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
