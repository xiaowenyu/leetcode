package com.xwy.leetcodeeasy.array;

/**
 * 时间复杂度O(n^2)
 * 用hashMap存储后在操作时间复杂度O(n),空间复杂度O(n)
 * Created by xiaowenyu on 2018/9/12.
 */
public class Add {

    public static void main(String[] args) {

        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        new Add().twoSum(nums, target);

    }


    public int[] twoSum(int[] nums, int target) {
        //遍历nums，如果找出target-nums[i]的值则返回

        for (int i = 0; i < nums.length ; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }

            }
        }
        return null;
    }

}
