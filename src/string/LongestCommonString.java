package string;

import java.util.Arrays;

public class LongestCommonString {
    public static void main(String[] args) {
        LongestCommonString lg = new LongestCommonString();
        String[] input = {""};
        System.out.println( "The longest Common Prefix is : " +
                lg.longestCommonPrefix(input));
    }
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 0)
            return "";

        if(n == 1)
            return strs[0];

        Arrays.sort(strs);
        /*for(int i =0 ; i < strs.length ; i++){
            System.out.println(""+strs[i]);
        }*/
        int end = Math.min(strs[0].length() , strs[n-1].length());
        int i =0;
        while (i < end && strs[0].charAt(i) == strs[n-1].charAt(i))
            i++;
        String pre = strs[0].substring(0,i);
        if(pre.length() > 1) return pre;
        return "";

    }
}
