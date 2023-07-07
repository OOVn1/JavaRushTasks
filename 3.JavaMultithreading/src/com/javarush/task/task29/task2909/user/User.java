package com.javarush.task.task29.task2909.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class User {
    private String name;
    private String surname;
    private int age;
    private Work work;
    @Setter(AccessLevel.PRIVATE)
    private Address address;
    private boolean man;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Имя: " + getName());
        System.out.println("Фамилия: " + getSurname());
    }

    public void printAdditionalInfo() {
        System.out.println("Пользователь " + (getAge() < 16 ? "моложе" : "старше") + " 16 лет");
    }

    public String getBoss(){
        return work.getBoss();
    }

    public String getCountry() {
        return address.getCountry();
    }

    public void setCountry(String country) {
        address.setCountry(country);
    }

    public String getCity() {
        return address.getCity();
    }

    public void setCity(String city) {
        address.setCity(city);
    }

    public String getAddress() {
        return address.getCountry() + " " + address.getCity() + " " + address.getHouse();
    }
}