package string;

import java.util.HashMap;
import java.util.Map;

public class EqualStrng {
    public static void main(String[] args) {
        EqualStrng equalStrng = new EqualStrng();
        Boolean val = equalStrng.makeEqual(new String[] {"a","b"});
        System.out.println(""+val);
    }
    public boolean makeEqual(String[] words) {
        HashMap<Character , Integer> hm = new HashMap<>();
        if(words.length == 1)
            return true;
        int toatalCount = 0;
        for (String s:words){
            toatalCount += s.length();
        }
        if(toatalCount % words.length != 0){
            return false;
        }
        for(int i=0; i < words.length ; i++) {
            for(int j = 0 ; j < words[i].length() ; j++) {
                if(hm.containsKey(words[i].charAt(j))) {
                    hm.put(words[i].charAt(j) , hm.getOrDefault(words[i].charAt(j), 1)+1);
                }else {
                    hm.put(words[i].charAt(j),1);
                }
            }
        }

        int max = hm.get(words[0].charAt(0));
        int n = words.length;
        for(Map.Entry<Character,Integer> ent : hm.entrySet()) {
            if (ent.getValue() % n != 0) {
                return false;
            }

            /*if(ent.getValue() != max) {
                return false;
            }
            if(ent.getValue() > 1) {
                System.out.println("" +ent.getKey() +"" + "-" + ent.getValue());
            }*/
        }



        return true;
    }
}
