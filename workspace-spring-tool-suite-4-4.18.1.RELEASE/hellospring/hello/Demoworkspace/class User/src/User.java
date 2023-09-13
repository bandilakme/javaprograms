
public class User {
	int id;
	String name;
}
public class Student extends User {
	int rank;
	public static void main(String[] args) {
	//parent class object creation
	Student s = new Student();
	s.rank = 1;
	//accessing parent class properties using child class object
	User user =new User();
	user.id = 101;
	user.name = "priya";
	System.out.println(s.id + "--" + s.name + "--" + s.rank);
}
}
	


