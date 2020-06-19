
public class Cup {

	private int contents;
	private boolean available = false; // there is something in the cup
	
		synchronized public int get() {
		while (!available) {         // if there is nothing available the consumer can't get it and waits
			try {
				wait();
			}catch (InterruptedException e) {}
		}
		available = false;
		notifyAll();       //notify()
		return contents;
	}

	synchronized public void put(int value) {
		while (available) {
			try {
				wait();
			} catch (InterruptedException e) {} //try-catch block
		}
		available = true;
		contents = value;
		notifyAll();
	}
	
}

