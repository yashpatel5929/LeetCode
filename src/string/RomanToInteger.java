package string;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger rm = new RomanToInteger();
        int res = rm.romanToInt("MCMXCIV");
        System.out.println(""+res);
    }
    public int romanToInt(String s) {
        HashMap<Character , Integer> hm  = new HashMap<Character, Integer>();
        hm.put('I' , 1);
        hm.put('V' , 5);
        hm.put('X' , 10);
        hm.put('L' , 50);
        hm.put('C' , 100);
        hm.put('D' , 500);
        hm.put('M' , 1000);

        char[] arr = s.toCharArray();
        int ans = 0;
        for(int i =0 ; i < arr.length ; i++) {
            if (i < s.length() - 1 && hm.get(arr[i]) < hm.get(arr[i+1])) {
                ans -=  hm.get(arr[i]);
            } else {
                ans +=  hm.get(arr[i]);
            }
        }

        return ans;
    }
}
