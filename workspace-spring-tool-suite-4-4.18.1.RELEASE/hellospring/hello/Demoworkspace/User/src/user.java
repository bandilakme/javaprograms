
public class User {
	int id;
	String name;
}
public class Student extends User {
	int rank;
	public static void main(String[] args) {
	//child class object creation
	Student s =new Student();
	s.rank = 1;
	//accessing parent class properties using child class obj;
	s.id =101;
	s.name = "priya";
	System.out.println(s.id + "--" + s.name + "--" + s.rank);
	}
}
	


