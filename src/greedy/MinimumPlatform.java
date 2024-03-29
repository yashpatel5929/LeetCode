package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;



public class MinimumPlatform {
    public static void main(String[] args) {
        MinimumPlatform minimumPlatform = new MinimumPlatform();
//        MinimumPlatform.findPlatform(new int[]{0900, 0940, 0950, 1100, 1500, 1800} , new int[]{} , )
    }

    static int findPlatform(int arr[], int dep[], int n)
    {

        Arrays.sort(arr);
        Arrays.sort(dep);
        int plat_needed = 1;
        int result = 1;
        int i =1 ;
        int j =0;

        while (i < n && j < n) {
            if(arr[i] <= dep[j]){
                plat_needed++;
                i++;
            }else if(arr[i] > dep[j]) {
                plat_needed--;
                j++;
            }
            if(plat_needed > result) {
                result = plat_needed;
            }
        }

        return result;

    }
}
