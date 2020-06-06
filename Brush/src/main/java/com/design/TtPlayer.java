package com.design;

/**
 * 端游爱好者
 */
public class TtPlayer implements  Iplayer{
    @Override
    public void play(Game game) {
        System.out.println("玩端游,打怪升级......");
    }
}
