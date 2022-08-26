package progra3.payroll.logic;

import java.util.Arrays;

public class Person {
    private int id;
    private String name;
    private boolean sex;
    private String civil_state;
    private java.util.List<String> hobbies;

    public Person() {
        this.id = 0;
        this.name = "";
        this.sex = true;
        this.civil_state = "";
        this.hobbies = new java.util.ArrayList<>();
    }

    public Person(int id, String name, boolean sex, String civil_state, java.util.List<String> hobbies) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.civil_state = civil_state;
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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getCivil_state() {
        return civil_state;
    }

    public void setCivil_state(String civil_state) {
        this.civil_state = civil_state;
    }

    public java.util.List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(java.util.List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        String return_string = "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=";
        if (sex) return_string += "'male'";
        else return_string += "'female'";
        return_string += ", civil_state='" + civil_state + '\'' +
                ", hobbies=" + hobbies +
                '}';
        return return_string;

    }
}
