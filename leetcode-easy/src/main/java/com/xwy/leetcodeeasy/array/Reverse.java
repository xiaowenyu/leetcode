package com.xwy.leetcodeeasy.array;

/**
 * $oth: 用%10的方式倒过来获取，与最大最小值判断溢出(注意最后一位)
 * Created by xiaowenyu on 2018/9/12.
 */
public class Reverse {

    public static void main(String[] args) {
        int num = -123;
        System.out.println(new Reverse().reverse(num));
    }

    public int reverse(int x) {
        //将数字转为字符串之后倒过来输出
        //判断首字母是否为-
        //然后在转为字符串，抛异常则返回0
        String xStr = x+"";
        char[] xchars = xStr.toCharArray();

        xStr = "";
        for (int i = xchars.length -1; i >= 0; i--) {
            if(i==0 && xchars[0] == '-'){
                xStr = xchars[0] + xStr;
            }else {
                xStr += xchars[i];
            }
        }

        try {
           return Integer.parseInt(xStr);
        }catch(Exception e){
            return 0;
        }

    }

}
