package array;

public class SortColor {
    public static void main(String[] args) {
        SortColor st = new SortColor();
        st.sortColors(new int[]{2,0,1});
    }
    public void sortColors(int[] nums) {

        for(int i = 0 ; i < nums.length ; i++) {
            for(int j = nums.length-1 ; j > i ; j-- ) {
                if(nums[i] <= nums[j]) {
                    continue;
                }else {
                    swap(nums, i , j);
                }
            }
        }

        for(int i= 0 ; i < nums.length ; i++) {
            System.out.println(""+nums[i]);
        }

    }

    public static void swap(int[] nums , int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
