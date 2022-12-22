package people.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    private int id;
    private String name;
    private String gender;
    private String marital_state;
    private java.util.ArrayList<String> hobbies;

    public Person() {
        this.id = 0;
        this.name = "";
        this.gender = "";
        this.marital_state = "";
        this.hobbies = new java.util.ArrayList<String>();
    }

    public Person(int id, String name, String gender, String marital_state, java.util.ArrayList<String> hobbies) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.marital_state = marital_state;
        this.hobbies = hobbies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarital_state() {
        return marital_state;
    }

    public void setMarital_state(String marital_state) {
        this.marital_state = marital_state;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", marital_state='" + marital_state + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
