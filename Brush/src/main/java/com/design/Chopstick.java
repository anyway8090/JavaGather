package com.design;

/**
 * ������
 */
public class Chopstick  implements CuttFoodTool,PickFoodTool{

    @Override
    public void cuttFood(String food) {
        System.out.println("�и��� :" + food);
    }
    @Override
    public void pickFood(String food) {
        System.out.println("������ :" + food);
    }

}
