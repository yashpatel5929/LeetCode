package array;

import java.util.*;

import static java.util.Collections.swap;

public class NextPermutation {

    public static void main(String[] args) {
  NextPermutation np = new NextPermutation();
  np.nextPermutation(new int[]{1,2,3});
    }

    public void nextPermutation(int[] nums) {

        int dip = -1;
        int len = nums.length;
        for(int i = len-2 ; i >= 0 ; i--) {
            if(nums[i] < nums[i+1]) {
                dip = i;
                break;
            }
        }

        if(dip == -1) {
            reverse(nums,0,len);
            return;
        }

        for(int j = len-1 ; j > dip ; j--){
            if(nums[j] > nums[dip]) {
                int tmp = nums[j];
                nums[j] = nums[dip];
                nums[dip] = tmp;
                break;
            }
        }

        reverse(nums,dip+1,len-1);



        for(int i : nums) {
            System.out.println(""+i);
        }


    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
