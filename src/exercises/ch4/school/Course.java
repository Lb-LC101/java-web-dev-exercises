package exercises.ch4.school;

import java.util.ArrayList;

public class Course {
    //Name of Course
    private String name;
    // List of Students
    private ArrayList<Student> students;
    // Worth number of credits
    private int worthNumberOfCredits;



    // Constructors
    public Course(String name, int worthNumberOfCredits) {
        this.name = name;
        this.worthNumberOfCredits = worthNumberOfCredits;
       // this.worthNumberOfCredits = numberOfCredits;
    }

    @Override
    public String toString() {
        return this.name + " is worth " + this.worthNumberOfCredits + " number of credits.";
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Course) == false) return false;
        Course myCourseObj = (Course) obj;
        if (myCourseObj.name.equals(this.name)) {
            return true;
        }   else {
            return false;
        }
    }
}
