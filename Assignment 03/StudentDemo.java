import java.util.Scanner;
import java.util.ArrayList;

public class StudentDemo {
	Scanner sc = new Scanner(System.in);
	
	private ArrayList<Student> Student;
	
	public StudentDemo() {
		Student = new ArrayList<Student>();
    }
	
	public void addStudents(Scanner sc, Student st){
        //System.out.println("How Many Students do you wish to add: ");
		//int n = sc.nextInt();
		//for(int i=0; i<n; i++){
			//System.out.println("Enter PRN, Name, DOB and Marks: ");
			//int prn = sc.nextInt();
			//String name = sc.next();
			//String dob = sc.next();
			//double marks = sc.nextInt();

        Student.add(st);
		}


	
	public ArrayList<Student> getStudents() {
		return Student;
    }

	public Student searchByName(String name) {
        for (Student s : Student) {
            if (s.getName().equals(name)){
                return s;
            }
        } 
        return null;
    }
	
	public Student searchByPRN(int prn) {
        for (Student s : Student) {
            if (s.getPRN() == prn) {
                return s;
            }
        }
        return null;
    }
}
