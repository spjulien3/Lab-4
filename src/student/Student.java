package student;

import java.util.ArrayList;

public class Student {
    private String fname;
    private String lname;
    private ArrayList<Course>courseList;

    public Student() {
    }

    public Student(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
        courseList= new ArrayList<Course>();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void addCourse(String courseName,int creditHours, char letterGrade ){
    courseList.add(new Course(courseName,creditHours,letterGrade));
    }
    public String toString(){ return fname +" "+ lname+" " +" has a "+ Course.computeGPA(courseList);  }
}
