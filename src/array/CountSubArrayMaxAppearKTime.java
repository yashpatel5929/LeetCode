package array;

public class CountSubArrayMaxAppearKTime {
    public static void main(String[] args) {
        CountSubArrayMaxAppearKTime countSubArrayMaxAppearKTime = new CountSubArrayMaxAppearKTime();
        countSubArrayMaxAppearKTime.countSubarrays(new int[]{1,3,2,3,3} , 2);
    }

    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int i : nums){
            max = Math.max(max,i);
        }
        System.out.println("ma " + max);
         int window_size = k;
         int count = 0;
         for (int i= 0 ; i < window_size ; i++) {
             if(nums[i] == max) {
                 count++;
             }
            if(i == window_size-1 && window_size != nums.length){
                window_size++;
            }
            
         }
        return 323232323;
    }

}
