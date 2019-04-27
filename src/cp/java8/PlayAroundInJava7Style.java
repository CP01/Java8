package cp.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayAroundInJava7Style {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("A","V",1),
				new Person("B","W",1),
				new Person("C","X",1),
				new Person("D","Y",1),
				new Person("E","Z",1)
				);
		// Sort by lname desc
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o2.getLname().compareTo(o1.getLname());
			}
			
		});
		
		// Create a method that prints all elements in the list
		printAll(people);
		
		// Create a method that prints all people that have last name beginning with C
		printLNameWithZ(people);
		
		// Conditionally via Anonymous Inner Class
		printConditionally(people, new ConditionInterface() {

			@Override
			public boolean test(Person p) {
				return p.getLname().startsWith("Z");
			}
			
		});
		printConditionally(people, new ConditionInterface() {

			@Override
			public boolean test(Person p) {
				return p.getFname().startsWith("A");
			}
			
		});

	}

	private static void printLNameWithZ(List<Person> people) {
		for(Person p : people) {
			if(p.getLname().startsWith("Z")) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {

		for(Person p : people) {
			System.out.println(p);
		}
	}
	
	private static void printConditionally(List<Person> people, ConditionInterface condition) {
		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}

}


interface ConditionInterface {
	boolean test(Person p);
}
