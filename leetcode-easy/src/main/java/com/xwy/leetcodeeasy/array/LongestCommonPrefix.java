package com.xwy.leetcodeeasy.array;

/**
 * Created by xiaowenyu on 2018/9/12.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0){
            return "";
        }

        //取出第一个前缀，判断后面的前缀是否相同
        String result = "";
        int minLength = strs[0].length();

        //获取最短的字符串的长度
        for (String str: strs) {
            minLength = str.length() > minLength ? minLength : str.length();
        }

        //遍历最小的长度和所有字符串
        for (int i = 0; i < minLength; i++) {
            for (int j = 1; j < strs.length ; j++) {
                if (strs[j].charAt(i) != strs[0].charAt(i)){
                    return result;
                }
            }
            result += strs[0].charAt(i);
        }
        return result;
    }

}
