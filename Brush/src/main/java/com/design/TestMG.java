package com.design;

/**
 * ��������ԭ�������
 */
public class TestMG {

    public static void main(String[] args) {
/*
        Player xiaowang = new Player();
        //С��������
        xiaowang.play(new MobileGame());
        //С�������
        xiaowang.play(new TerminalTour());*/

        Iplayer xiaoli = new TtPlayer();
        xiaoli.play(new TerminalTour());
        Iplayer xiaozhang = new GmPlayer();
        xiaoli.play(new MobileGame());
    }
}
