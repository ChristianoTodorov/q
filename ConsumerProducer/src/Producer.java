
public class Producer implements Runnable {

	private int num;
	private Cup cup;

	public Producer(Cup c, int num) {
		this.num = num;
		cup = c;
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			cup.put(i);
			System.out.println("Producer #" + this.num + " put " + i);
			try {
				Thread.sleep((long) Math.random() * 200);
			} catch (InterruptedException e) {}
		}

	}


}
