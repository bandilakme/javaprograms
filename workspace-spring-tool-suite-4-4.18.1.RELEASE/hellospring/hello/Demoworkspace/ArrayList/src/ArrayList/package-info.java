package Array;

import java.util.*;
class GFG {
	public void main(String[] args) {
		//Declaring the ArrayList with
		//intial size n
		ArrayList<Integer> a1=new ArrayList<Integer>();
		//Appending new elements at the end of the list
		for(int i=1;i<=5;i++)
			a1.add(i);
		//Remove element at index 3
		a1.remove(3);
		//Displaying the ArrayList after deletion
		System.out.println(a1);
		//Printing elements one by one
		for(int i=0;i< a1.size();i++)
			System.out.println(a1.get(i) + " ");
	}

}




		 
		
	
	
