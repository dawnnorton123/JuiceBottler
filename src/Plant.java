public class Plant {

	Mutex mutex = new Mutex();
	// How long do we want to run the juice processing
	public static final long PROCESSING_TIME = 7 * 1000;

	private static final int NUM_PLANTS = 5;

	public static void main(String[] args) {
		// Startup the plants

		Employee[] employee = new Employee[NUM_PLANTS];
		for (int i = 0; i < NUM_PLANTS; i++) {
			employee[i] = new Employee(i);
			employee[i].startEmployee();

		}

		// Give the plants time to do work
		delay(PROCESSING_TIME, "Plant malfunction");
		for (Employee e : employee) {
			e.stopEmployee();
		}

		for (Employee e : employee) {
			e.waitToStop();
		}

		// Summarize the results
		int totalProvided = 0;
		int totalProcessed = 0;
		int totalBottles = 0;
		int totalWasted = 0;

		for (Employee e : employee) {
			totalProvided += e.getProvidedOranges();
			totalProcessed += e.getProcessedOranges();
			totalBottles += e.getBottles();
			totalWasted += e.getWaste();
		}

		System.out.println("Total provided/processed = " + totalProvided + "/" + totalProcessed);
		System.out.println("Created " + totalBottles + ", wasted " + totalWasted + " oranges");
	}

	private static void delay(long time, String errMsg) {
		long sleepTime = Math.max(1, time);
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			System.err.println(errMsg);
		}
	}

}