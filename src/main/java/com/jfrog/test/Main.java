package com.jfrog.test;

/**
 * Created by iland on 8/9/2018.
 */
public class Main {


    public static void main(String[] args) {
        Die die = new Die();
        DieBye diabye = new DieBye();
        System.out.println("hello");
        System.out.println("try jenkins");

        System.out.println(die.getStr());
        System.out.println(diabye.getStr());
    }

}
