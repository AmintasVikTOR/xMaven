package com.htp;

import org.apache.commons.lang3.RandomUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(trueOrFalse());

        // Clear...

        //Added in Master
        System.out.println(myRandomDouble());

        //branch-cherry))
        System.out.println(myRandomInteger());

        //branch-cherry2
        System.out.println(myRandomFloat());

        //branch-cherry3
        System.out.println(trueOrFalse());


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
