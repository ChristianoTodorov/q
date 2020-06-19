public class Main {
	
	public static void main(String[] args) {

		Cup cup = new Cup();
		Thread c1 = new Thread(new Consumer(cup, 1));
		Thread p1 = new Thread(new Producer(cup, 2));
		//Thread c2 = new Thread(new Consumer(cup, 2));
		c1.start();
		p1.start();
		//c2.start();
		// c2.start();
		
	}

}
