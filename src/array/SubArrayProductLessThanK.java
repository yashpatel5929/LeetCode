package array;

public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        SubArrayProductLessThanK subArrayProductLessThanK = new SubArrayProductLessThanK();
        int res = subArrayProductLessThanK.numSubarrayProductLessThanK(new int[]{10,9,10,4,3,8,3,3,6,2,10,10,9,3} , 19);
        System.out.println(""+res);
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for(int i = 0 ; i < nums.length-1 ; i++) {
           if(nums[i] < k) count++;
           int j = i+1;
           int prod = nums[i] * nums[j];
           if(prod < k) {
               count++;
               j++;
           }else continue;
           while (j < nums.length){
               prod = Math.abs(prod * nums[j]);
                if(prod < k) {
                    count++;
                    j++;
                }else{
                    break;
                }
           }
           /*int n = i+1;
           int prod=-1;
           while (n  < nums.length) {
               if(nums[i] * nums[n] < k){
                   count++;
                   prod = Math.abs(prod * (nums[i] * nums[n]));
                   n++;
               }
           }*/
        }
        if(nums[nums.length-1] < k) count++;
        return count;
    }
}
