package program;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String surname;
    private Integer age;
    private String birthplace;

    public Person(String name, String surname, Integer age, String birthplace) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthplace = birthplace;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthplace='" + birthplace + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
}
