
public class Start {
	public static void main(String[] args) {
		Worker[] workers = new Worker[5];
		Thread[] threads = new Thread[workers.length];
		
		for (int i = 0; i < workers.length; i++) {
			workers[i] = new Worker("W"+i);
			threads[i] = new Thread(workers[i]);
			threads[i].start();
		}
		
		try {
			for (int i = 0; i < threads.length; i++) {
				threads[i].join();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
