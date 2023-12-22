package array;

public class maxPoduct {

    public static void main(String[] args) {
        maxPoduct maxPoduct = new maxPoduct();
        System.out.println(""+maxPoduct.maxProduct(new int[]{3,4,5,2}));
    }

    public int maxProduct(int[] nums) {
        int max = 0;
        for(int i= 0 ; i < nums.length ; i++) {
            for(int j = 1 ; j < nums.length ; j++ ) {
                if(((nums[i]-1)*(nums[j]-1)) > max) {
                    max = (nums[i]-1)*(nums[j]-1);
                }
            }
        }

        return max;
    }
}
