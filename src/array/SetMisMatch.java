package array;

import java.util.HashMap;
import java.util.Map;

public class SetMisMatch {
    public static void main(String[] args) {
        SetMisMatch sm = new SetMisMatch();
        int[] ans = sm.findErrorNums(new int[]{2,2});
        for(int i=0 ; i < ans.length ; i++) {
            System.out.println(""+ans[i]);
        }
    }

    private int[] findErrorNums(int[] nums) {
        int duplicate = -1;
        int missing = -1;
        int n = nums.length;
        int[] ans = new int[n+1];

        for(int i = 0 ; i < n ;i++){
            ans[nums[i]]++;
        }

        for(int i = 1 ; i < ans.length ; i++) {
            if(ans[i] == 2)
                duplicate = i;
            if(ans[i] == 0)
                missing = i;
        }

        return new int[]{duplicate,missing};
    }


  /*  private int[] findErrorNums(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i =0 ; i < nums.length ; i++) {
            hm.put(nums[i] , hm.getOrDefault(nums[i] ,0)+1);
        }
        int[] ans = new int[2];
        for(Map.Entry<Integer , Integer> ent : hm.entrySet()){
            if(ent.getValue() > 1) {
                ans[0] = ent.getKey();
                if(nums.length > 2) {
                    if (hm.containsKey(ent.getKey() + 1)) {
                        ans[1] = ent.getKey() - 1;
                    } else {
                        ans[1] = ent.getKey() + 1;
                    }
                }else {
                    if(ent.getKey() > 1){
                        ans[1] = ent.getKey() -1;
                    }else {
                        ans[1] =ent.getKey() +1;
                    }
                }
            }

        }

        return ans;

    }*/

   /* public int[] findErrorNums(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int prev = 0;
        int next = 0;
        int[] ans = new int[2];
        for(int i=0; i< nums.length-1 ; i++){
            prev = nums[i];
            next = nums[i+1];
            if(prev == next){
                ans[0] = prev;
                if(nums.length > 2){
                    if(nums[i-1] > prev){
                        ans[1]  = prev - 1;
                    }else {
                        ans[1] = prev + 1;
                    }
                }else {
                    if(prev > 1)
                        ans[1] = prev-1;
                    else
                        ans[1] = prev+1;
                }
            }



//            hm.put(nums[i] , hm.getOrDefault(nums[i] ,0)+1);
        }

        *//*int[] ans = new int[2];
        for(Map.Entry<Integer , Integer> ent : hm.entrySet()){
            if(ent.getValue() > 1) {
                ans[0] = ent.getKey();


            }
        }*//*
        return ans;
    }*/
}
