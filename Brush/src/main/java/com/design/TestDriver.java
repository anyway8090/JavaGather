package com.design;

/**
 * �����滻ԭ�����
 */
public class TestDriver {
    public static void main(String[] args) {
        People xiaoming = new People();
     /*   //Сʱ��
        xiaoming.dirver(new Bicycle());
        //�����
        xiaoming.dirver(new Car());*/

        xiaoming.dirver(new Tractor());
        xiaoming.work(new Tractor());
    }
}
