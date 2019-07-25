package cp.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;

public class SimpleExample {

	static HashMap<Integer, String> cache = new HashMap<>();
	static {
		cache.put(1, "A");
		cache.put(2, "B");
		cache.put(3, "C");
		cache.put(4, "D");
	}
	public static void main(String[] args) {

		//takeFI((int a, int b) -> a+b);
		Thread t = new Thread(() -> System.out.println("hello"));
		Comparator comp1 = ((Object a, Object b)->(int)a + (int) b);
		Comparator comp2 = ((a, b)->(int)a + (int) b);
		
		Optional<String> optional = findUser(2);

		optional.ifPresent(user -> {
		    System.out.println("User's name = " + user);    
		});
		
		optional = findUser(1);

		optional.ifPresent(user -> {
		    System.out.println("User's name = " + user.toString());    
		});
	}

	public static Optional findUser(int id) {
		System.out.println(cache.get(id));
		Optional<Object> optional = 
				Optional.of(cache.get(id) != null ? cache.get(id):Optional.empty());
		return optional;
	}
}
