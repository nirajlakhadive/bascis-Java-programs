
abstract class Person {
	String name;
	int age;
	
	//Method for feeding the details.
	void setDetails(String name, int  age) {
		this.name = name;
		this.age = age;
	}
	// Abstract type method which can be overload to display the Details.
	abstract void displayDetails();
	
}

class Teacher extends Person{
	
	String eid = "SCHTEACH46578";
	
	void displayDetails() {
		System.out.println("Teacher ID  : "+eid);
		System.out.println("Name : " +name);
		System.out.println("Age : "+age);
	}
	
}


class Student extends Person{
	String sid = "SCHSTUD78945";
	
	void displayDetails() {
		System.out.println("Student ID  : "+sid);
		System.out.println("Name : " +name);
		System.out.println("Age : "+age);
	}
}







public class abstractClassPract {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		t1.setDetails("Hrutik Roshan", 37);
		
		Student s1 = new Student();
		s1.setDetails("Niraj Lakhadive", 27);
		
		t1.displayDetails();
		s1.displayDetails();

	}

}
