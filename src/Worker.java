
public class Worker implements Runnable{
	
	private String name;
	public Worker(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			System.out.println(name + " " + (int)(Math.random()*10));
		}
	}

}
