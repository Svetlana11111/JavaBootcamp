package sef.module9.sample;
// Needs to be completed
import java.util.*;

public class SetSample {
	public static void main(String[] args) {
		//1 - Create a new HashSet and name it monthSet
		Set set = new HashSet();
		set.add("1");
		set.add("1");
		set.add("1");
		set.add("1");
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		//System.out.println(set.);

		for(Object s : set) {
			System.out.println(s);
		}

		//2 - Add duplicate month names in it. For eg. January can be entered twice
		//duplicates will return false
		//System.out.println(monthSet.add("January"));

		System.out.println("Output : ");
		//3 - Iterate through the HashSet and print all the months.
		
		//You'd notice that duplicate names are not printed. 
	}
}
