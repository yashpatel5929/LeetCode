package array;

import java.util.*;

public class OccurenceNumber {
    public static void main(String[] args) {
        OccurenceNumber oc = new OccurenceNumber();
        Boolean al = oc.uniqueOccurrences(new int[]{1,2});
        System.out.println(""+al);
    }
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i=0 ; i< arr.length ; i++) {
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i] , hm.getOrDefault(arr[i],0)+1);
            }else {
                hm.put(arr[i], 1);
            }
        }

        Set<Integer> st = new HashSet<>(hm.values());

        return st.size() == hm.size();

      /*  int ans =(int) hm.values().stream().distinct().count();
        System.out.println("-"+hm.values().stream().distinct().count());
        if(ans != hm.values().size())
            return false;

        return true;
*/    }
}
