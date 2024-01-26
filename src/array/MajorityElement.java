package array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int num = me.majorityElement(new int[]{2,2,1,1,1,2,2});
        System.out.println(""+num);
    }

    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++) {
                hm.put(nums[i],hm.getOrDefault(nums[i] , 0)+1);
        }

        for(Map.Entry<Integer,Integer> ent : hm.entrySet()){
            int val = n/2;
            if(ent.getValue() > val) {
                return ent.getKey();
            }
        }

        return -1;
    }
}
