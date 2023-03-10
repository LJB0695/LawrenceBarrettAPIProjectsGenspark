package com.genspark.SpringBootdemoCourses.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_courses")
public class Course {
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseID;

    private String courseTitle;
    private String courseInstructor;


    public Course()
    {

    }

    public Course( String courseTitle, String courseInstructor) {
        this.courseTitle = courseTitle;
        this.courseInstructor = courseInstructor;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }
}
