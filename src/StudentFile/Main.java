package StudentFile;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n ---Student.Student Management System--- ");
            System.out.println("1. Add Student.Student");
            System.out.println("2. Update Student.Student");
            System.out.println("3. Delete Student.Student");
            System.out.println("4. Search Student.Student");
            System.out.println("5. Sort Student.Student by Marks");
            System.out.println("6. Display all Students");
            System.out.println("7. Exit");
            System.out.println("Choose your option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student Marks: ");
                    double marks = scanner.nextDouble();
                    management.addStudent(new Student(id, name, marks));
                    break;

                case 2:
                    System.out.println("Enter Student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter new Student Name: ");
                    String newName = scanner.nextLine();
                    System.out.println("Enter new Student Mark: ");
                    double newMark = scanner.nextDouble();
                    management.updateStudent(updateId, newName, newMark);
                    break;

                case 3:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    management.deleteStudent(deleteId);
                    break;

                case 4:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();
                    Student student = management.searchStudent(searchId);
                    if (student != null) {
                        System.out.println("Student Found: " + student);
                    } else {
                        System.out.println("Student with ID " + searchId + " not found.");
                    }
                    break;

                case 5:
                    // Sort students by marks
                    management.sortStudentsByMarks();
                    break;

                case 6:
                    // Display all students
                    management.displayStudents();
                    break;

                case 7:
                    // Exit the program
                    System.out.println("Exiting the system.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}