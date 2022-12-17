package mainPack;

import mainPack.person.Human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static HashMap<String, ArrayList<Human>> base = new HashMap<>();

    public static void showMap(){
        for(Map.Entry<String, ArrayList<Human>> map : base.entrySet()){
            System.out.println(map.getKey());
            ArrayList<Human> temp = map.getValue();
            temp.forEach(System.out::println);
            System.out.println();
        }
    }
    

}
