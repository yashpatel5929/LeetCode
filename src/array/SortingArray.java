package array;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {
        SortingArray st = new SortingArray();
        st.merge(new int[] {1,2,3,0,0,0} , 3 ,new int[]{2,5,6} , 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i =0 ; i < m ; i ++) {
            for(int j =0 ; j < n ; j++) {
                if(nums1[i] > nums2[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = temp;
                }
            }
        }


        for(int i = m, j = 0 ; j < n ; j++) {
            nums1[i] = nums2[j];
            i++;
        }

        Arrays.sort(nums1);
        for(int i =0 ; i < nums1.length ; i ++) {

                System.out.println("nums1" + nums1[i]);
        }




    }
}

