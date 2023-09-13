package mappingFunctions;
import java.util.Arrays;
import java.util.List;
public class mappingFunctionDemo { 
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		List<String> names=Arrays.asList("Cow", "Cow","Fox","Goat","Camel");
		//names.stream().filter(n->n.starts With("C")).forEach(System.out.println)
		//allMatch,distinct,anymatch,limit,skip
		names.stream().allMatch(n->n.contains("c"));
	}
}
		
		
		
		
		

				
				
	

