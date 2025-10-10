public class Student {
    //02724205101138
    int studentId;
    String studentName;
    char grade;

    
    Student() {
       
        this(0, "Unknown", 'N');
    }

   
    Student(int id, String name, char g) {
        studentId = id;
        studentName = name;
        grade = g;
    }

  
    void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Grade: " + grade);
    }

   
    public static void main(String[] args) {
       
        Student s1 = new Student();
        s1.display();

        System.out.println(); 

        
        Student s2 = new Student(1138, "Leya", 'A');
        s2.display();
    }
}