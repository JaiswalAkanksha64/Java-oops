package oops.programs;
//Creating Class and its object

public class Student {
	int id;
	String name;
	
	public void show() {
		System.out.println("This is a student method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.id = 1;
		s1.name = "Akshay";
		System.out.println(s1.id);
		System.out.println(s1.name);
		s1.show();

	}

}
