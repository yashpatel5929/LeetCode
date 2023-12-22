package array;

import com.sun.tools.javac.Main;

public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition s = new SearchInsertPosition();
        int res = s.searchInsert(new int[]{1,3,5,6} ,7 );
        System.out.println(""+res);
    }
    public int searchInsert(int[] nums, int target) {
       int low = 0;
       int high = nums.length -1;
       while (low <= high) {

           int mid = (low+high) / 2;
           if(nums[mid] == target) return mid;
           else if (nums[mid] > target) high = mid -1;
           else low = mid+1;
       }
       return low;
    }
}
