import java.util.Scanner;

class Student {
    private String rollNumber;
    private int marks;

    // Constructor
    public Student(String rollNumber, int marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Getter for roll number
    public String getRollNumber() {
        return rollNumber;
    }
}

public class HighestMarksFinder {
    
    // Method to compare two students and return the one with higher marks
    public static Student getHigherMarksStudent(Student student1, Student student2) {
        if (student1.getMarks() > student2.getMarks()) {
            return student1;
        } else {
            return student2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting details for Student 1
        System.out.print("Enter roll number for Student 1: ");
        String roll1 = scanner.nextLine();
        System.out.print("Enter marks for Student 1: ");
        int marks1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accepting details for Student 2
        System.out.print("Enter roll number for Student 2: ");
        String roll2 = scanner.nextLine();
        System.out.print("Enter marks for Student 2: ");
        int marks2 = scanner.nextInt();

        // Creating Student objects
        Student student1 = new Student(roll1, marks1);
        Student student2 = new Student(roll2, marks2);

        // Finding the student with higher marks
        Student higherMarksStudent = getHigherMarksStudent(student1, student2);

        // Displaying the result
        System.out.println("Student with highest marks:");
        System.out.println("Roll Number: " + higherMarksStudent.getRollNumber());
        System.out.println("Marks: " + higherMarksStudent.getMarks());

        // Closing the scanner
        scanner.close();
    }
}
