package exercise4_2;

public class TestMain {
	public static void main(String[] args) {
		 Student student = new Student("John Doe", "123 Main St", "Computer Science", 2, 1500.50);
	     Staff staff = new Staff("Jane Smith", "456 Maple Ave", "Engineering", 3000.00);
	     System.out.println(student);
	     System.out.println(staff);
	     
	     System.out.println("Student name: " + student.getName());
	     System.out.println("Student address: "+ student.getAddress());
	     student.setAddress("122 Cam Le");
	     System.out.println("Address after update: "+ student.getAddress());
	     System.out.println("Student program: " + student.getProgram());
	     System.out.println("Year: "+ student.getYear());
	     System.out.println("Fee: " + student.getFee());
	}
}
