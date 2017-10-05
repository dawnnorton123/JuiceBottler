
public class Employee implements Runnable {

	private static final int NUM_EMPLOYEE = 4;

	// Startup the Employee

	Employee[] employee = new Employee[NUM_EMPLOYEE];

	Employee() {
		new Thread(this, "Employee");

		for (int i = 0; i < NUM_EMPLOYEE; i++) {

		}

	}

	// supposed to start the employee
	@SuppressWarnings("null")
	public void startEmployee() {
		Thread thread = null;
		thread.start();
	}

	// supposed to stop the employee
	public void stopEmployee() {
	}

	// supposed to have the employee wait to stop
	@SuppressWarnings("null")
	public void waitToStop() {
		Thread thread = null;
		try {
			thread.join();
		} catch (InterruptedException e) {
			System.err.println(thread.getName() + " stop malfunction");
		}
	}

	// supposed to run the employee
	public void run() {
		System.out.print(Thread.currentThread().getName() + " I am working");
		boolean timeToWork = false;
		while (timeToWork) {

			System.out.print(".");
		}
		System.out.println("");
	}

}
