package com.xworkz.collection.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
    private String name;
    private int age;
    private String course;
    private String college;
    private String city;
    private String state;
    private String friendName;
    private String programming;
    private String collegeCity;
    private int passYear;

    public StudentDTO(){
        System.out.println("No args Constructor:");
    }

    public StudentDTO(String name, int age, String course, String college, String city, String state, String friendName, String programming, String collegeCity, int passYear) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.college = college;
        this.city = city;
        this.state = state;
        this.friendName = friendName;
        this.programming = programming;
        this.collegeCity = collegeCity;
        this.passYear = passYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getProgramming() {
        return programming;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public String getCollegeCity() {
        return collegeCity;
    }

    public void setCollegeCity(String collegeCity) {
        this.collegeCity = collegeCity;
    }

    public int getPassYear() {
        return passYear;
    }

    public void setPassYear(int passYear) {
        this.passYear = passYear;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", college='" + college + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", friendName='" + friendName + '\'' +
                ", programming='" + programming + '\'' +
                ", collegeCity='" + collegeCity + '\'' +
                ", passYear=" + passYear +
                '}';
    }
}
