package recusrssion;

import java.util.*;

public class SubSet1 {
    public static void main(String[] args) {
        SubSet1 s1 = new SubSet1();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(1);
        ArrayList ans = s1.subsetSums(input, 3);
        ans.forEach(t -> {
            System.out.println(""+t);
        });

    }

    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(!arr.contains(0)) ans.add(0);
        int sum = 0;
        for(int i = 0 ; i<arr.size() ; i++) {
            ans.add(arr.get(i));
            for(int j = i+1 ; j < arr.size() ; j++) {

                 ans.add(arr.get(i) + arr.get(j));
            }
        }
        for(int i=0 ; i < arr.size() ; i++){
            sum = sum + arr.get(i);
        }

        ans.add(sum);


        HashSet<Integer> distinctSet = new HashSet<>(ans);

        // Create a new ArrayList from the distinctSet
        ArrayList<Integer> distinctList = new ArrayList<>(distinctSet);;
        return distinctList;
    }
}
