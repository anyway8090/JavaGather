package com.design;

/**
 * ��һְ��ԭ�����
 */
public class TestEat {
    public static void main(String[] args) {
        Chopstick chopstick = new Chopstick();
        chopstick.cuttFood("̯����");
        chopstick.pickFood("̯����");

        Knife knife = new Knife();
        knife.cuttFood("̯����");
        Fork fork = new Fork();
        fork.pickFood("̯����");

    }
}
