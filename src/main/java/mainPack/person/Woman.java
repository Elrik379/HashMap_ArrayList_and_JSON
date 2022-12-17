package mainPack.person;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Woman extends Human {
    private String gender = "Женщина";

    public Woman(String name, int age) {
        super(name, age);
    }

    public String getGender() {
        return gender;
    }
}
