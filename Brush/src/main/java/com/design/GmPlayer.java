package com.design;

/**
 * 手游爱好者
 */
public class GmPlayer  implements Iplayer{
    @Override
    public void play(Game game) {
        System.out.println("玩手游,打怪升级......");
    }
}
