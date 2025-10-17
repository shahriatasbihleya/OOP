// ID : 02724205101138
import java.util.ArrayList;

public class Student {

    private int student_id;
    private String student_name;
    private ArrayList<Double> grades = new ArrayList<>();

    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }
    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade " + grade + " added successfully.");
        } else {
            System.out.println("Invalid grade! Please enter a value between 0 and 100.");
        }
    }

    
    public void showGrades() {
        System.out.println("Grades of " + student_name + ": " + grades);
    }

   
    public static void main(String[] args) {
       
        Student s1 = new Student();

        
        s1.setStudentId(101);
        s1.setStudentName("Shahria Tasbih Leya");

       
        s1.addGrade(95.5);
        s1.addGrade(88);
        s1.addGrade(102);  
        s1.addGrade(-5);   

      
        System.out.println("\nStudent ID: " + s1.getStudentId());
        System.out.println("Student Name: " + s1.getStudentName());
        s1.showGrades();
    }
}
