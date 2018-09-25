package com.xwy.leetcodeeasy.array;

/**
 * 时间复杂度O(log10^n) 空间复杂度O(log10^n)
 * Created by xiaowenyu on 2018/9/12.
 */
public class IsPalindrome {

    public static void main(String[] args) {

        int num = 10;
        System.out.println(new IsPalindrome().isPalindrome(num));

    }

    public boolean isPalindrome(int x) {
        //将数字转成char数组
        char[] xchars= (x+"").toCharArray();
        //遍历比较 两端的char值
        for (int i = 0; i < xchars.length/2; i++) {

            if(xchars[i] != xchars[xchars.length - i -1]){
                return false;
            }
        }
        return true;
    }
}
