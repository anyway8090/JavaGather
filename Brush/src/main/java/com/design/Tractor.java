package com.design;

/**
 * ������
 */
public class Tractor implements DirverTool {
    @Override
    public void dirvering() {
        System.out.println("��������");
    }

    //��ש
    public void carryBricks(){
        System.out.println("��ʼ��ש");
    }
}
