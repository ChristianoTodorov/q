
public class Krychle {

	private double strA;

	public double getStrA() {
		return strA;
	}

	public void setStrA(double strA) {
		this.strA = strA;
	}

	Krychle() {
	}

	Krychle(double A) {
		strA = A;
	}

	public double Objem() {
		double x = Math.pow(strA, 3);
		return x;
	}

	public double Povrch() {
		double y = 6 * Math.pow(strA, 2);
		return y;
	}

	public String toString() {
		return "Objem krychle je " + Objem() + " -- Povrch je " + Povrch();
	}
}
