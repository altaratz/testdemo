package com.jfrog.test;

/**
 * Created by udia on 8/19/2018.
 */
public class Main {


    public static void main(String[] args) {
        Die die = new Die();
        DieHi diehi = new DieHi();
        DieBye diabye = new DieBye();
        System.out.println("hello");
        System.out.println("Maven project one");


        System.out.println(die.getStr());
        System.out.println(diabye.getStr());
        System.out.println(diehi.getStr());
    }

}
