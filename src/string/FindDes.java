package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDes {

    public static void main(String[] args) {
        FindDes d = new FindDes();
        List<List<String>> citiesConnections = new ArrayList<>();

        // Add connections
        citiesConnections.add(List.of("London", "New York"));
        citiesConnections.add(List.of("New York", "Lima"));
        citiesConnections.add(List.of("Lima", "Sao Paulo"));


        d.destCity(citiesConnections);
    }
    public String destCity(List<List<String>> paths) {
        HashSet<String> city = new HashSet<>();
        for(List<String> src : paths){
            city.add(src.get(0));
        }

        for(List<String> des1: paths) {
            String des = des1.get(1);
            if(!city.contains(des)){
                return des;
            }
        }

        return "";
    }
}
