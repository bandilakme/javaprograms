package com.streamAPI;
import java.util.optional;
import java.util.stream.Stream;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

////write a java 8 stream API code to get values of max and min
public class max {
	public static void main(String[] args) {
		int maxvalue=Integer.MIN_VALUE;
		int[]arr1= {1,-5,3,14,-2,17};
		System.out.println("Enter the size of an array:");
		List<Integer> nums=Arrays.asList(1,-5,3,14,-2,17);
		String MAX=list.stream().max(Comparator.comparing(String::value of)).get();
		Optional<Integer> secondMax=nums.stream().distinct().skip(1).findFirst();;
		Optional<Integer> secondMin=nums.stream().distinct().skip(3).findFirst();;
		if(secondMin.ispresent()& secondMax.ispresent()) {
			Integer min=secondMin.get();
			Integer max=secondMax.get();
		}
		
		
		
		
		
		
		
	}


	
}






