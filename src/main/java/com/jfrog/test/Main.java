package com.jfrog.test;

/**
 * Created by udia on 8/19/2018.
 */
public class Main {


    public static void main(String[] args) {
        Die die = new Die();
        DieBye diabye = new DieBye();
        DieHi diehi = new DieHi();
        System.out.println("hello");


        System.out.println(die.getStr());
        System.out.println(diabye.getStr());
    }

}
