package exception.com;

public class userDfndExc {
	public static void main(String[] args) {
		try {
			System.out.println("creating our own Exception object");
			throw new MyException("User Defined Exception object");
		}   catch (MyExecption ex) {
			System.out.println("Catch User Defined Exception");
			System.out.println(ex.getMessage());
		}
		
	}

}

			
		
	
			
			
		
		
		
			
		
		
			
		
	


