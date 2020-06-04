package com.design;

/**
 * µ¥Ò»Ö°ÔðÔ­Ôò²âÊÔ
 */
public class TestEat {
    public static void main(String[] args) {
        Chopstick chopstick = new Chopstick();
        chopstick.cuttFood("Ì¯¼¦µ°");
        chopstick.pickFood("Ì¯¼¦µ°");

        Knife knife = new Knife();
        knife.cuttFood("Ì¯¼¦µ°");
        Fork fork = new Fork();
        fork.pickFood("Ì¯¼¦µ°");

    }
}
