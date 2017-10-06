
public class Employee implements Runnable {

	// Summarize the results

	int orangesProcessed;
	public final int ORANGES_PER_BOTTLE = 4;
	private final Thread thread;
	private int orangesProvided;
	private volatile boolean timeToWork;
	private static final int NUM_EMPLOYEE = 4;

	Employee[] employee = new Employee[NUM_EMPLOYEE];

	Employee(int num) {

		thread = new Thread(this, "Employee[" + num + "] ");
	}

	public int getProvidedOranges() {

		return orangesProvided;
	}

	public int getProcessedOranges() {

		return orangesProcessed;
	}

	public int getBottles() {
		int orangesProcessed = 0;

		return orangesProcessed / ORANGES_PER_BOTTLE;
	}

	public int getWaste() {

		return orangesProcessed % ORANGES_PER_BOTTLE;
	}

	public void startPlant() {
		timeToWork = true;
		thread.start();
	}

	public void stopPlant() {
		timeToWork = false;
	}

	public void startEmployee() {
		timeToWork = true;
		thread.start();
	}

	public void stopEmployee() {
		timeToWork = false;
	}

	public void waitToStop() {
		try {
			thread.join();
		} catch (InterruptedException e) {
			System.err.println(thread.getName() + " stop malfunction");
		}
	}

	public void run() {
		System.out.print(Thread.currentThread().getName() + " Processing oranges");
		while (timeToWork) {
			processEntireOrange(new Orange());
			orangesProvided++;
			System.out.print(".");
		}
		System.out.println("");
	}

	public void processEntireOrange(Orange o) {
		while (o.getState() != Orange.State.Bottled) {
			o.runProcess();
		}
		orangesProcessed++;
	}

}
