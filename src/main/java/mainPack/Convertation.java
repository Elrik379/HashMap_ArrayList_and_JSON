package mainPack;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;

public class Convertation{

    public static void convertationInJson(){
        try(FileWriter writer = new FileWriter("JSON.txt")) {
            ObjectMapper mapper = new ObjectMapper(); //создание объекта для сериализации в JSON
            mapper.writeValue(writer, MapClass.base);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
