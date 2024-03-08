package array;

public class RearrangeArrayElementBySign {

    public static void main(String[] args) {
        //3.1,-2,-5,2,-4
        RearrangeArrayElementBySign rearrangeArrayElementBySign = new RearrangeArrayElementBySign();
        int[] ds = rearrangeArrayElementBySign.rearrangeArray(new int[]{3,1,-2,-5,2,-4});
        for (int i=0 ; i < ds.length ; i++){
            System.out.println(""+ds[i]);
        }
    }

    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int pos = 0;
        int neg = 1;
        for(int i =0 ; i < n ; i++) {
            if(nums[i] > 0) {
                ans[pos] = nums[i];
                pos +=2;
            }else {
                ans[neg] = nums[i];
                neg +=2;
            }

            /*if(i % 2 == 0 && nums[i] >= 0) {
                ans[i] = nums[i];
            }else {
                int[] swapArr = swap(nums,i,i+1);
                ans[i] = swapArr[i];
            }*/
        }

        return ans;
    }

    int[] swap(int[] num , int start , int end) {
        int temp = num[start];
        num[start] = num[end];
        num[end] = temp;
        return num;
    }
}
