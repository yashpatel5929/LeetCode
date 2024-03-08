package string;

import java.util.*;

public class SortByCharacter {

    public String frequencySort(String s) {
        char[] charArr = s.toCharArray();
        HashMap<Character , Integer> hm = new HashMap<>();

        for(int i=0; i< charArr.length ; i++) {
            if(hm.containsKey(charArr[i])) {
                hm.put(charArr[i] , hm.getOrDefault(charArr[i] , 0) +1);
            }else{
                hm.put(charArr[i] , 0);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Character , Integer> map : hm.entrySet()) {
            list.add(map.getValue());
        }

        Collections.sort(list , new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        

        return "";
    }
}
