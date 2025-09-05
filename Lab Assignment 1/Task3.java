import java.util.Scanner;

class Student{
    int rollnumber;
    String name;
    String course;
    double marks;
    char grade;

    Scanner input = new Scanner(System.in);

    public void inputStudent(){
        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your roll number: ");
        rollnumber = input.nextInt();
        input.nextLine();
        System.out.println("Enter your course: ");
        course = input.nextLine();
        System.out.println("Enter your marks: ");
        marks = input.nextDouble();
        input.nextLine();

        calculateGrade(marks);
    }

    public void calculateGrade(double marks){
        if(marks >= 90){
            grade = 'A';
        } else if(marks >= 80){
            grade = 'B';
        } else if(marks >= 70){
            grade = 'C';
        } else if(marks >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void displayStudent(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

}

class StudentManagementSystem{
    Student[] students;
    int count;
    Scanner input = new Scanner(System.in);
    public StudentManagementSystem(int size){
        students = new Student[size];
        count = 0;
    }

    public void addStudent(){
        if(count < students.length){
            Student s = new Student();
            s.inputStudent();
            s.calculateGrade((int)s.marks);
            students[count] = s;
            count++;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Student list is full.");
        }
    }

    public void displayAllStudents(){
        if(count == 0){
            System.out.println("No students to display.");
            return;
        }else{
            System.out.println("Displaying all students:");        
            for(int i = 0; i < count; i++){
                students[i].displayStudent();
                System.out.println("-------------------");
            }
        }
    }

}

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the max number of students: ");
        int size = input.nextInt();
        input.nextLine();
        StudentManagementSystem Sms = new StudentManagementSystem(size);
        int choice;
        do{
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    Sms.addStudent();
                    break;
                case 2:
                    Sms.displayAllStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while(choice != 3);
        input.close();
    }
}
