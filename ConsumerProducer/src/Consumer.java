
public class Consumer implements Runnable {

	private int number;
	private Cup cup;

	public Consumer(Cup c, int number) {
		cup = c;
		this.number = number;
	}

	public void run() {
		int value = 0;

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			value = cup.get();
			System.out.println("Consumer #" + this.number + " got " + value);

		}

	}

}