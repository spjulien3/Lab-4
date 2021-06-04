package student;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private int creditHr;
    private char letterGrade;

    public Course() {
    }

    public Course(String courseName, int creditHr, char letterGrade) {
        this.courseName = courseName;
        this.creditHr = creditHr;
        this.letterGrade = letterGrade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditHr() {
        return creditHr;
    }

    public void setCreditHr(int creditHr) {
        this.creditHr = creditHr;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }
    public static double computeGPA(ArrayList<Course>courseList ){
        double gpa=0;
        double pointValue= 0;
        double totalCredit= 0;
        double qualityPointValue=0;
        for (int i=0;i<courseList.size();i++){
            totalCredit+= courseList.get(i).getCreditHr();
        }
        for (int i=0; i<courseList.size();i++){
            switch (courseList.get(i).getLetterGrade()) {
                case 'A':
                    pointValue = 4.0;
                    break;
                case 'B':
                    pointValue = 3.0;
                    break;
                case 'C':
                    pointValue = 2.0;
                    break;
                case 'D':
                    pointValue = 1.0;
                    break;
                case 'F':
                    pointValue = 0.0;
                    break;
            }
            qualityPointValue+=pointValue * courseList.get(i).getCreditHr();
        }
        gpa=qualityPointValue/totalCredit;
        return gpa;
    }
}
