package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.in;

public class IsoMorphicString {
    public static void main(String[] args) {
        IsoMorphicString isoMorphicString = new IsoMorphicString();
        Boolean and =isoMorphicString.isIsomorphic("badc" , "baba");
        System.out.println(""+and);
    }

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character> hm = new HashMap<>();
        char[] arr = s.toCharArray();
        char[] title = t.toCharArray();
        Set<Character> set1 = new HashSet();
        Set<Character> set2 = new HashSet<>();
        for(int i=0 ; i < s.length() ; i++) {
            set1.add(arr[i]);
            set2.add(title[i]);
        }
        if(set1.size() != set2.size())
            return false;
        for(int i=0 ; i < arr.length ; i++) {
            hm.put(arr[i] , title[i]);
        }

        for(int i = 0 ; i < title.length ; i++) {
            if(hm.get(arr[i]) != title[i]) {
                return false;
            }
        }



        return true;
    }
}
