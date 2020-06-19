
public class Pozice {
	private int pozX;
	private int pozY;
	private int value;
	
	public Pozice(int x,int y,int value) {
		this.pozX = x;
		this.pozY = y;
	}

	public int getPozX() {
		return pozX;
	}

	public void setPozX(int pozX) {
		this.pozX = pozX;
	}

	public int getPozY() {
		return pozY;
	}

	public void setPozY(int pozY) {
		this.pozY = pozY;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
