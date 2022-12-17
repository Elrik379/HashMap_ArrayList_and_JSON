package mainPack;

import mainPack.person.Human;
import mainPack.person.Man;
import mainPack.person.Woman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Process {


    public static void load() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Human.txt"))) {
            while (bufferedReader.ready()) {
                String[] stringArray = bufferedReader.readLine().split(", ");
                if (verifyArrayList(stringArray[3])) {
                    ArrayList<Human> humansList = humanList(stringArray[3]);
                    if (stringArray[2].equals("м"))
                        humansList.add(new Man(stringArray[0], Integer.parseInt(stringArray[1])));
                    else
                        humansList.add(new Woman(stringArray[0], Integer.parseInt(stringArray[1])));
                    MapClass.base.replace(stringArray[3], humansList);

                } else {
                    ArrayList<Human> humans = new ArrayList<>();
                    if (stringArray[2].equals("м"))
                        humans.add(new Man(stringArray[0], Integer.parseInt(stringArray[1])));
                    else {
                        humans.add(new Woman(stringArray[0], Integer.parseInt(stringArray[1])));
                    }
                    MapClass.base.put(stringArray[3], humans);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean verifyArrayList(String key) {
        return MapClass.base.containsKey(key);
    }

    public static ArrayList<Human> humanList(String keys) {
        for (String key : MapClass.base.keySet()) {
            if (key.equals(keys))
                return MapClass.base.get(key);
        }
        return new ArrayList<Human>();
    }

}
