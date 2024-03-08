package string;

import java.util.Arrays;
import java.util.HashMap;

public class StringToInteger {
    public static void main(String[] args) {
        StringToInteger stringToInteger = new StringToInteger();
        int res = stringToInteger.myAtoi("-91283472332");
        System.out.println(""+res);
    }

    public int myAtoi(String s) {
       s = s.trim();
       if(s.isEmpty())
           return 0;
       boolean isNegative = false;
       int ans = 0;
       char[] input = s.toCharArray();
       for(int i = 0 ; i < input.length ; i++) {
           if(i == 0) {
               if(input[i] == '-'){
                   isNegative = true;
                   continue;
               }else if(input[i] == '+'){
                   isNegative = false;
                   continue;
               }
           }
           if(input[i] >= '0' && input[i] <= '9') {
               int digit = input[i] - '0';

               if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                   return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
               }
               ans = ans * 10 + digit;

              /* if(isNegative) {
                   int check = -ans;
                   if(check > Integer.MAX_VALUE) return Integer.MIN_VALUE;

               }else {
                   if(ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
               }*/
           }else {
               break;
           }
       }

       if(isNegative)
           ans = -ans;

       return ans;
    }

    public int notWorkingSolution(String s) {
        HashMap<Character , Integer> hm = new HashMap<>();

        for(int i =0 ; i <= 10 ; i++) {
            hm.put((char) (i+'0') , i);
        }

        char[] in = s.toCharArray();
        int ans = 0;
        Boolean isNegative = false;
        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
        for(int i=0 ; i < in.length ; i++) {
            if(hm.containsKey(in[i])) {
                ans = (ans*10) + hm.getOrDefault(in[i] , 0);
            }else if(in[i] == '-') {
                isNegative = true;
            } else if (in[i] == ' ') {
                continue;
            }else {
                return ans;
            }

        }

        if(isNegative) {
            ans = ans * -1;
            if(ans < MIN)  return MIN;
        }


        if(ans > MAX) return MAX;
        return ans;
    }
}
