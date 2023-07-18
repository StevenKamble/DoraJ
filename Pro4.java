import java.io.*;
import java.util.Scanner;

public class Pro4{
    private static final String FILE_PATH = "students.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");

            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();
                    searchStudent(searchName);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void addStudent() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student roll number: ");
            String rollNumber = scanner.nextLine();

            writer.write(name + "," + rollNumber);
            writer.newLine();

            System.out.print("Student added successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while adding the student: " + e.getMessage());
        }
    }

    private static void displayAllStudents() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            System.out.println("Student List:");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String rollNumber = parts[1];
                System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the student file: " + e.getMessage());
        }
    }

    private static void searchStudent(String name) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String studentName = parts[0];
                String rollNumber = parts[1];
                if (studentName.equals(name)) {
                    System.out.println("Student Found:");
                    System.out.println("Name: " + studentName + ", Roll Number: " + rollNumber);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student not found.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the student file: " + e.getMessage());
        }
    }

    
}
