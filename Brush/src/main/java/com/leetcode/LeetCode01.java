package com.leetcode;

public class LeetCode01 {

    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int targer = 9;
        twoSum(nums,targer);
    }


    public static  int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return null;
    }

}
