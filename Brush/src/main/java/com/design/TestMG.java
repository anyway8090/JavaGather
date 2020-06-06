package com.design;

/**
 * 依赖倒置原则测试类
 */
public class TestMG {

    public static void main(String[] args) {
/*
        Player xiaowang = new Player();
        //小王玩手游
        xiaowang.play(new MobileGame());
        //小王玩端游
        xiaowang.play(new TerminalTour());*/

        Iplayer xiaoli = new TtPlayer();
        xiaoli.play(new TerminalTour());
        Iplayer xiaozhang = new GmPlayer();
        xiaoli.play(new MobileGame());
    }
}
