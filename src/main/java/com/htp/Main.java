package com.htp;

import org.apache.commons.lang3.RandomUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(trueOrFalse());

        // Clear...

        //branch-4.1
        System.out.println(helloWelcome());

    }

    private static int myRandomInteger() {
        return RandomUtils.nextInt();
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

    public static double myRandomFloat() {
        return RandomUtils.nextFloat();
    }


}
