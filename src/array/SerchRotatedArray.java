package array;

public class SerchRotatedArray {
    public static void main(String[] args) {
        SerchRotatedArray sn = new SerchRotatedArray();
        int ans = sn.search(new int[]{1,3} , 4);
        System.out.println(""+ans);
    }

    public int search(int[] nums, int target) {
        /*int n = nums.length;
        int k = n - nums[0];
        if(n == 1 && nums[0] == target) return 0;
        int low = k+1;
        int high = n-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if(target == nums[mid]) return mid;
            else if (target > nums[mid]) {
                low = mid+1;
            }else {
                high = mid -1;
            }
        }
*/
        int n = nums.length;
        int low = 0 ;
        int high = n-1;

        while (low <= high) {
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid -1;
                }else {
                    low = mid+1;
                }
            }else {
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
