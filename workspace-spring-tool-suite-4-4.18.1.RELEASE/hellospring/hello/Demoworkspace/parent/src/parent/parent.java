package parent;

 class Parent {
	 Void m1 () {
	
		System.out.println(" Parent-Class-m1 () called");
		Void m2 () {
	
		System.out.println(" Parent- Class- m2 () called");
	}
}
class Child extends Parent {
	public int hashcode () {
		return 101;
	}
	
	void m1 () {
	System.out.println(" Child- Class- m1 () called");
	 void m2 () {
	 }
	


	System.out.println(" Child- Class- m2 () called");
	super.m2 ();
	}
}

class Test {
	public static void main(String[] args) {
		Child c = new Child();
		c.m1 ();
		c.m2 ();
		int hashcode = c.hashcode();
		System.out.println("Hashcode :: " + hashcode);
	}
}

	



		
	









	
	

	
	
	


		
	


