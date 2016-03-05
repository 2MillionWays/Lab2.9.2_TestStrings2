package com.brainacad.oop.teststrings2;

public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        char[] strArrayOne = myStr1.toCharArray();

        for (char arrayElement : strArrayOne) {
            if (myStr2.indexOf(arrayElement) == -1) {
                System.out.print(arrayElement);
            }
        }
    }
}