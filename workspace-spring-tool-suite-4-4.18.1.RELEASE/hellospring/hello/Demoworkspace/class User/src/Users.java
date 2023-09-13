
public class Users {
	int id;
	String name;
	public Users() {
		System.out.println("parent class :: 0- param comstructor called");
	}
}
public class employee extends User {
	double salary ;
	public employee() {
		System.out.println("Child class - m2() method called");
	}
	void m2() {
		System.out.println("Child class :: - m2() method called");
	}
	public static void main(String[] args) {
		//creating object for child class
		employee emp = new employee();
		//initializing Child  class properties using child object
		emp.id = 101;
		emp.name = "John";
		//initializing parent class properties using its own object
		emp.salary = 4500.00;
		System.out.println(emp.id + "--" + emp.name + "--" + emp.salary);
	}

		
	}
	


