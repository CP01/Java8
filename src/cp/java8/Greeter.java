package cp.java8;

public class Greeter {

	public static void main(String[] args) {
		Greeter greet = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greet.greet(helloWorldGreeting);

	}

	public void greet(Greeting greeting) {
		//System.out.println("Hello World");
		greeting.perform();
	}
}
