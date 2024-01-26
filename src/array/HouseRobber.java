package array;

public class HouseRobber {
    public static void main(String[] args) {
        HouseRobber hr = new HouseRobber();
        int ans = hr.rob(new int[]{2,1,1,2});
        System.out.println(""+ans);
    }
    public int rob(int[] nums) {
        int rob = 0;
        int notRob = 0;
        for(int i=0 ; i< nums.length ; i++) {
            int currRob = notRob + nums[i]; //4
            notRob = Math.max(notRob , rob); //3
            rob = currRob;//4
        }

        return Math.max(notRob,rob);

        /*int even = 0;
        int odd = 0;
        for(int i=0 ; i < nums.length ;i++) {
            if((i % 2) == 0) {
                even = even + nums[i];
            }else {
                odd = odd + nums[i];
            }
        }
        if(even>odd) return even; else return odd;*/
    }

}
