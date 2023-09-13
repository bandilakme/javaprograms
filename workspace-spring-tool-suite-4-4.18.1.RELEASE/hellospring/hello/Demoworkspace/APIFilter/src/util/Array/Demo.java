package util.Array;
import java.util.*;
import java.util .List;
import java.util.stream.Stream;
public class Demo {
	public static void main(String[] args) {
		List< >list =Arrays.asList(66,32,45,12,20);
		for (Integer i:list) {
		 if(i>20) {
		 System.out.println(i);
		 }
		}
		Stream<Integer> Stream=list.stream();
		Stream<Integer> filteredStream=Stream.filter(i-> i>20);
		filteredStream.forEach(i-> System.out.println(i));
		list.stream().filter(i->i>20).forEach(i-> System.out.println(i));
	}
}

	


	
		
				
	

		
		 
		
		
		 
	
