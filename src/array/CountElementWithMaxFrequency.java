package array;

import java.util.HashMap;
import java.util.Map;

public class CountElementWithMaxFrequency {
    public static void main(String[] args) {
        CountElementWithMaxFrequency countElementWithMaxFrequency = new CountElementWithMaxFrequency();
        int ans = countElementWithMaxFrequency.maxFrequencyElements(new int[]{1,2,3,4,5});
        System.out.println(""+ans);
    }

    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i <  nums.length ; i++) {
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }

        int max = 0;
        for(Map.Entry<Integer,Integer> ent : hm.entrySet()) {
            if(ent.getValue() > max) {
                max = ent.getValue();
            }
        }

        int count = 0;
        for(Map.Entry<Integer,Integer> ent : hm.entrySet()) {
            if(ent.getValue() == max) {
                count = count + ent.getValue();
            }
        }

        return count;

    }
}
