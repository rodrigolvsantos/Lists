package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		//The list no accept primitive types on Java
		//IS necessary utility wrape class do int (Integer) etc 
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//insert String in position 2
		list.add(2, "Marco");
	   
		//view lenght of list
		System.out.println(list.size());
		
		//remove element of list

		
	  //go through all for each
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
	
		//list.remove(1);
		
		//For remove an element of list, use a function pridcate (lambda)
		list.removeIf(x -> x.charAt(0)== 'M'); 
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		
		//For search an element of list, use a function predicate (lambda)
		System.out.println("Index of Bob: "+ list.indexOf("Bob"));
		System.out.println("Index of Bob: "+ list.indexOf("Marco"));
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		
		//Search in list so who initiate the name witch A
		//Necessary create a new list and reference old list
		//Step 1 - Convert the list to stream (necessary for apply function lambda)
		//Step 2 -Convert the stream to collect list
		List<String> result = list.stream().filter(x -> x.charAt(0)== 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		
		//Find first name initiate whith A
		String name = list.stream().filter(x -> x.charAt(0)== 'A').findFirst().orElse(null);
		System.out.println(name);
	}
	
}
