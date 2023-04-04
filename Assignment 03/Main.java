import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDemo sd = new StudentDemo();


        while (true) {
            System.out.println("1. Add Students");
            System.out.println("2. Display");
            System.out.println("3. Search by Name");
            System.out.println("4. Search by PRN");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
					System.out.println("\nEnter Student Details:");
                    System.out.print("Enter PRN: ");
                    int prn = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Date of Birth: ");
                    String dob = scanner.next();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();

                    Student st = new Student(prn, name, dob, marks);
                    sd.addStudents(scanner, st);
                    System.out.println("\n");
                    break;
                    
                case 2:
					System.out.println("Entered Items In StudentDemo: ");
					for (Student student : sd.getStudents()) {
						System.out.println("\n" + student.getPRN() + "\t" + student.getName() + "\t" + student.getDOB() + "\t" + student.getMarks() + "\n");
					}
                    break;
                    
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.next();
                    Student searchResults = sd.searchByName(searchName);
                    System.out.println(searchResults.getPRN() + "\t" + searchResults.getName() + "\t" + searchResults.getDOB() + "\t" + searchResults.getMarks());
                    }
			}
		}	
	}
