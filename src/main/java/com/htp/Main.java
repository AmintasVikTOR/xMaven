package com.htp;

import org.apache.commons.lang3.RandomUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(trueOrFalse());
        System.out.println(helloWelcome());
        System.out.println(myRandomDouble());

    }

    public static boolean trueOrFalse() {
        return RandomUtils.nextBoolean();
    }

    public static String helloWelcome() {
        return "returned-helloWelcomeWorld";
    }

    public static double myRandomDouble() {
        return RandomUtils.nextDouble();
    }
}
