package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static void main(String[] args) {
        MajorityElementII me = new MajorityElementII();
        List<Integer> ans = me.majorityElement(new int[]{1,2});
        ans.forEach(integer -> {
            System.out.println(""+integer);
        });
    }
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++) {
            hm.put(nums[i],hm.getOrDefault(nums[i] , 0)+1);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> ent : hm.entrySet()){
            int val = n/3;
            if(ent.getValue() > val) {
                ans.add(ent.getKey());
            }else if(val == 0){
                ans.add(ent.getKey());
            }
        }

        return ans;
    }
}
