
public class Account {
	
	private int accNum;
	private String name;
	public void setAccnum(int accNum) {
		this.accNum = accNum;
	}
	public int getAccNum() {
		return this.accNum;
	}
	public void setName(String name) {
		this.name =name;
	}
	public String getName() {
		return this.name;
	}
}
public class Test  {
	
	public static void main(String[] args) {
		Account obj = new Account(); //obj creation
		obj.setAccnum(676767);
		obj.setName('Lakshmi');
		
		int accNum = obj.getAccNum();
		string name =obj.getName();
		System.out.println(accNum + "--" +name);
	}

		
	}



	
	
	

	
	


