package com.brainacad.c2_lab8.demosocket;

import java.io.Serializable;

/**
 * Created by SHARK on 04.06.2017.
 */
public class Student implements Serializable {
    private String name;
    private String course;
    private int id;

    public Student(String name, String course, int id) {
        this.name = name;
        this.course = course;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", id=" + id +
                '}';
    }
}
