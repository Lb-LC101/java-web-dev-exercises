package exercises.ch4.school;

import java.sql.SQLOutput;

public class  Student {

    public static void main(String[] args) {
        Student myself = new Student( "Lisa",1, 30, 4.0);
        Student twin = new Student ("Lisa", 2, 20, 2.0);
        Teacher theTeacher = new Teacher();
//        String myGradeLevel = myself.getGradeLevel();
//        System.out.println(myGradeLevel);
//       myself.addGrade( 3,3.0);
//        System.out.println(myself.gpa);
//        myself.addGrade( 3,3.0);
//        System.out.println(myself.gpa);

        //System.out.println(myself.toString());
//        System.out.println(myself.equals(theTeacher));
        Course myFirstCourse = new Course("My First Course", 2);
        Course mySecondCourse = new Course("My First Course", 3);

       // System.out.println(myFirstCourse.equals(mySecondCourse));
        System.out.println(myFirstCourse.toString());
    }
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        // Current total quality score
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;

        //quality score = letter grade * number of credits
       double newQualityScore = grade * courseCredits;

        //total quality score = gpa * number of credits
        double newTotalQualityScore = currentTotalQualityScore + newQualityScore;

        //Update student's total number of credits
        int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;
        this.numberOfCredits = newTotalNumberOfCredits;

        //gpa = (total quality score) / (total number of credits)
        double newGpa = newTotalQualityScore / newTotalNumberOfCredits;
        this.gpa = newGpa;
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (this.numberOfCredits >= 0 && this.numberOfCredits <= 20) {
            return "Freshman";
        } else if (this.numberOfCredits >= 30 && this.numberOfCredits <= 59) {
            return "Sophomore";
        } else if (this.numberOfCredits >= 60 && this.numberOfCredits <= 89) {
            return "Junior";
        } else if (this.numberOfCredits >= 90) {
            return "Senior";
        } else {
            return null;
        }

    }

    @Override
    public String toString() {
         return this.name + ": " + this.gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Student) == false) return false;
        Student myStudentObj = (Student) obj;
        if (myStudentObj.name.equals(this.name)) return true;
        else return false;
    }

    /* getters and setters  */
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return this.studentId;
    }
    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return this.gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}


