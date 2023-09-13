
class parent {
	int a = 10;
	String parentString ="string value";
	parent() {
		System.out.println("parent constructor");
	}
	public void method() {
		System.out.println("method in parent class");
	}
	public void parentmethod() {
		System.out.println("parent method");
	}
	class child extends parent {
		int b = 20;
		String childstring ="child string value";
		child() {
			System.out.println("child constructor");
		}
		public void method() {
			System.out.println("method in child class");
		}
		public void childmethod() {
			System.out.println("child method");
		}
	}


		
		
		
	
	
	}


}
