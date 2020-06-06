package com.design;

/**
 * 拖拉机
 */
public class Tractor implements DirverTool {
    @Override
    public void dirvering() {
        System.out.println("开拖拉机");
    }

    //搬砖
    public void carryBricks(){
        System.out.println("开始搬砖");
    }
}
