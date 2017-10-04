
public class Employee implements Runnable {

	 private static final int NUM_EMPLOYEE = 4;

	    
	        // Startup the plants
	    	
	        Employee[] employee = new Employee[NUM_EMPLOYEE];
	        for (int i = 0; i < NUM_EMPLOYEE; i++) {
	           employee[i] = new Employee();
	           employee[i].startEmployee();
	        }



	    	        
		
	        Employee() {
	            int orangesProvided = 0;
	            int orangesProcessed = 0;
	            Thread thread = new Thread(this, "Employee");
	        }
	        
	        public void startEmployee() {
	            boolean timeToWork = true;
	            Thread thread = null;
				thread.start();
	        }

	        public void stopEmployee() {
	            boolean timeToWork = false;
	        }

	        public void waitToStop() {
	            Thread thread = null;
				try {
	                thread.join();
	            } catch (InterruptedException e) {
	                System.err.println(thread.getName() + " stop malfunction");
	            }
	        }
	        
	        public void run() {
	            System.out.print(Thread.currentThread().getName() + " Off to work we go");
	            boolean timeToWork = false;
				while (timeToWork) {
	             //   processEntireOrange(new Orange());
	              //  orangesProvided++;
	                System.out.print(".");
	            }
	            System.out.println("");
	        }
	        
}

	    

	    