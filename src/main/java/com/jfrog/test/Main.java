package com.jfrog.test;

/**
 * Created by udia on 8/19/2018.
 */
public class Main {


    public static void main(String[] args) {
        Die die = new Die();
        DieHi diehi = new DieHi();
        DieBye diabye = new DieBye();
        DieMy diemy = new DieMy();
        DieSay diesay = new DieSay();
        System.out.println("hello frog");
        System.out.println("welcome to the swamp");
        System.out.println("don't be");
        System.out.println("just another frog");


        System.out.println(die.getStr());
        System.out.println(diabye.getStr());
        System.out.println(diehi.getStr());
        System.out.println(diemy.getStr());
        System.out.println(diesay.getStr());
    }

}
