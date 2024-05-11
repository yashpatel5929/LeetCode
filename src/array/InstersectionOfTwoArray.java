package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class InstersectionOfTwoArray {

     public static void main(String[] args) {
        InstersectionOfTwoArray inter = new InstersectionOfTwoArray();
        int[] ans = inter.intersection(new int[]{1,2,2,1} , new int[]{2,2});
        for(int i=0; i < ans.length ;i++) {
            System.out.println(""+ans[i]);
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i < nums1.length ; i++) set.add(nums1[i]);
        for(int j =0 ; j < nums2.length ; j++){
            if(set.contains(nums2[j])){
                ans.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }

        int[] res = new int[ans.size()];
        for(int k = 0 ; k < ans.size() ; k++){
            res[k] = ans.get(k);
        }
        return res;
    }
}
