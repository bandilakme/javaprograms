package Collector2;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;
public class DuplicateElements {
	public static void main(String[] args) {
		String input ="Ispendwithmyparentstoday";
		//duplicates in a stream
	
		String[] arr = input.split("");
		System.out.println(Arrays.toString(arr));
		Map<String,Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors());
		List<String> Duplicates = map.entrySet().stream().stream().filter(i->i.getValue()==2).map(i->i.getKey(.Collectors.toList()))
				System.out.Println(Duplicates);
		//
        

		
	
	
