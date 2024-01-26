package array;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        MergeIntervals mg = new MergeIntervals();
        int[][] res = mg.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        for(int i = 0 ; i < res.length ; i++){
            for(int j = 0 ; j < res[i].length ; j++) {
                System.out.println(""+res[i][j]);
            }
        }
    }

    public int[][] merge(int[][] intervals) {

       Arrays.sort(intervals, new Comparator<int[]>() {
           @Override
           public int compare(int[] o1, int[] o2) {
               return o1[0] - o2[0];
           }
       });

       List<List<Integer>> ans = new ArrayList<>();
       for(int i=0 ; i < intervals.length ; i++){
           int start = intervals[i][0];
           int end = intervals[i][1];

           if(!ans.isEmpty() && end <= ans.get(ans.size()-1).get(1)){
               continue;
           }

           for(int j = i+1 ; j < intervals.length ; j++) {
               if(intervals[j][0] <= end){
                   end = Math.max(end , intervals[j][1]);
               }else{
                   break;
               }
           }
           ans.add(Arrays.asList(start,end));
       }

        int[][] array = ans.stream()
                .map(innerList -> innerList.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
       return array;

    }
}
