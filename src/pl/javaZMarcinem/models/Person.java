package pl.javaZMarcinem.models;

public class Person {
    private String name;
    private String surname;
    private String address;
    private int age;


    public Person(String name, String surname, String address, int age) {
        this.name = name;
        this.address = address;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name " + name + "surname " + surname + "address " + address + "age " + age;
    }

    public String getName() {
        return this.name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
