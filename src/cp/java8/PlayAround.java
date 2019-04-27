package cp.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayAround {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("A","V",1),
				new Person("B","W",1),
				new Person("C","X",1),
				new Person("D","Y",1),
				new Person("E","Z",1)
				);
		// Sort by lname
		Collections.sort(people, (p1, p2) -> p2.getLname().compareTo(p1.getLname()));
		
		// Create a method that prints all elements in the list
		printAll(people);
		System.out.println("printAll method not required, printConditionally method can also prints all elements");
		printConditionally(people, p -> true);
		
		// Create a method that prints all people that have last name beginning with Z
		System.out.println("prints all people that have last name beginning with Z");
		printConditionally(people, p -> p.getLname().startsWith("Z"));
		// Create a method that prints all people that have first name beginning with A
		System.out.println("prints all people that have first name beginning with A");
		printConditionally(people, p -> p.getFname().startsWith("A"));
		
	}
	
	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {

		for(Person p : people) {
			System.out.println(p);
		}
	}

}


interface Condition {
	boolean test(Person p);
}