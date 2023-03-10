package org.example.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentID;
    private String name;
    private String favoriteClass;

    public Student(){}

    public Student(int studentID, String name, String favoriteClass) {
        this.studentID = studentID;
        this.name = name;
        this.favoriteClass = favoriteClass;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteClass() {
        return favoriteClass;
    }

    public void setFavoriteClass(String favoriteClass) {
        this.favoriteClass = favoriteClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", favoriteClass='" + favoriteClass + '\'' +
                '}';
    }
}
