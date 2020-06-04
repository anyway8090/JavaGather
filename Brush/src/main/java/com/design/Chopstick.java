package com.design;

/**
 * 筷子类
 */
public class Chopstick  implements CuttFoodTool,PickFoodTool{

    @Override
    public void cuttFood(String food) {
        System.out.println("切割了 :" + food);
    }
    @Override
    public void pickFood(String food) {
        System.out.println("夹起了 :" + food);
    }

}
