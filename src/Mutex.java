
public class Mutex implements Runnable {

	private boolean fetched = false;
	private boolean peeled = false;
	private boolean squeezed = false;
	private boolean bottled = false;

	// employee will fetch the orange
	public synchronized void fetch() {

		while (fetched) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		fetched = true;
		System.out.println(Thread.currentThread().getName() + "I am fetching");

	}

	// employee will peel the orange
	public synchronized void peel() {

		while (peeled) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		peeled = true;
		System.out.println("I am peeling");
	}

	// employee will squeeze the orange
	public synchronized void squeeze() {

		while (squeezed) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		squeezed = true;
		System.out.println("I am squeezing");
	}

	// employee will bottle the juice

	public synchronized void bottle() {

		while (bottled) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("I am bottleing");
		bottled = true;
	}

	public void run() {

	}

}
