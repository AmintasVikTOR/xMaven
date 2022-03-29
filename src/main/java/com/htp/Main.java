package com.htp;

import org.apache.commons.lang3.RandomUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(trueOrFalse());
        System.out.println(helloWelcome());
        System.out.println(myRandomDouble());
        System.out.println(myRandomDouble());//master
        System.out.println(myRandomDouble());//master
        System.out.println(myRandomDouble());//master2
        System.out.println(myRandomDouble());//master2
        System.out.println(myRandomDouble());//master3
        System.out.println(myRandomDouble());//master4
        System.out.println(myRandomInteger());
        System.out.println(myRandomInteger());//chapter2
        System.out.println(myRandomInteger());//chapter3.1
        System.out.println(myRandomFloat());//chapter3.1

        System.out.println(myRandomFloat());//chapter3.2
        System.out.println(myRandomFloat());//chapter3.2

        System.out.println(myRandomFloat());//chapter3.3

        System.out.println(myRandomFloat());//chapter3.4

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
    }//3.1
}
