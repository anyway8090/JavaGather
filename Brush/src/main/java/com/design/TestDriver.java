package com.design;

/**
 * 里氏替换原则测试
 */
public class TestDriver {
    public static void main(String[] args) {
        People xiaoming = new People();
     /*   //小时候
        xiaoming.dirver(new Bicycle());
        //长大后
        xiaoming.dirver(new Car());*/

        xiaoming.dirver(new Tractor());
        xiaoming.work(new Tractor());
    }
}
