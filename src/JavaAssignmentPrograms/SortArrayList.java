package JavaAssignmentPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 

	    list.add("I"); 
	    list.add("Am"); 
	    list.add("Vishal"); 
	    list.add("Panchal"); 
	    list.add("Java Program"); 
	
	    System.out.println("Unsorted ArrayList: " + list); 
	
	    Collections.sort(list); 

	    System.out.println("Sorted ArrayList in Ascending order : " + list); 
	}

}
