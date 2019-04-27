package cp.java8;

public class RunnableExample {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			/* (non-Javadoc)
			 * @see java.lang.Runnable#run()
			 */
			@Override
			public void run() {
				System.out.println("Inside Run");
			}
			
		});
		thread.start();
		
		Thread lamdaThread = new Thread(() -> System.out.println("Lamda Thread"));
		lamdaThread.start();
	}

}
