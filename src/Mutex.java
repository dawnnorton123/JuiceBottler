
public class Mutex {

	private boolean fetched = false;
	private boolean peeled = false;
	private boolean squeezed = false;
	private boolean bottled = false;


	public synchronized void fetch(){


		while(fetched){
			try{
				this.wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
				
			}
			fetched = true;	
		}
				
	public synchronized void peel(){


		while(peeled){
			try{
				this.wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
				
			}
			peeled = true;	
		}

	public synchronized void squeeze(){


		while(squeezed){
			try{
				this.wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
				
			}
			squeezed = true;	
		}
	
	public synchronized void bottle(){


		while(bottled){
			try{
				this.wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
				
			}
			bottled = true;	
		}
	
}
	

	



