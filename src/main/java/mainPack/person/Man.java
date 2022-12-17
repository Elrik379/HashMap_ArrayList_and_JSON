package mainPack.person;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Man extends Human {
    private String gender = "Мужчина";

    public Man(String name, int age) {
        super(name, age);
    }

    public String getGender() {
        return gender;
    }

}
