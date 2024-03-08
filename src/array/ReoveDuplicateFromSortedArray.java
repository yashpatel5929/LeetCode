package array;

public class ReoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        ReoveDuplicateFromSortedArray reoveDuplicateFromSortedArray = new ReoveDuplicateFromSortedArray();
        int count = reoveDuplicateFromSortedArray.removeDuplicates(new int[]{0,0,0,0,3});
        System.out.println("count "+count);
    }

    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int i = 0;
        int j = 1;
        int count = 0;
        while(j != n) {
            if(nums[i] != nums[j]){
                nums[count+1] = nums[j];
                count++;
            }
            i++;
            j++;

        }

        for(int k=0;k < nums.length ; k++) {
            System.out.println(""+nums[k]);
        }

        return count+1;
    }

    int[] swap(int i , int j , int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[nums.length] = temp;
        return nums;
    }


}
