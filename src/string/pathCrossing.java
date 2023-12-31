package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class pathCrossing {

    public static void main(String[] args) {
        pathCrossing pt = new pathCrossing();
        Boolean res = pt.isPathCrossing("NES");
        System.out.println(""+res);
    }
    public boolean isPathCrossing(String path) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("0,0");
        int x = 0 ,y = 0;
        for(int i = 0 ; i < path.length() ; i++) {
            char direction = path.charAt(i);
            if(direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            } else if (direction == 'E') {
                x--;
            }else {
                x++;
            }
            String currentCoordinates = x+","+y;
            if(hashSet.contains(currentCoordinates)){
                return true;
            }
            hashSet.add(currentCoordinates);
        }
        return false;
    }
        /*Boolean res = true;
        HashMap<Character , Integer> hm= new HashMap<>();

        if(path.length() == 2) {
            if((path.charAt(0) == 'S' && path.charAt(1) == 'N') || (path.charAt(0) == 'N' && path.charAt(1) == 'S')) {
                return true;
            }else if((path.charAt(0) == 'E' && path.charAt(1) == 'W') || (path.charAt(0) == 'W' && path.charAt(1) == 'E')){
                return true;
            }
        }

        for(int i=0 ; i < path.length() ; i++) {


            if(hm.containsKey(path.charAt(i))) {
                hm.put(path.charAt(i) , hm.getOrDefault(path.charAt(i), 1)+1);
            }else {
                hm.put(path.charAt(i),1);
            }

        }

        for(Map.Entry<Character,Integer> ent : hm.entrySet()) {
            if(ent.getValue() > 1) {
                return true;
            }
        }

        return false;
    }*/

}
