
public class Kvádr {

	private double a, b, c;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	Kvádr() {
	}

	Kvádr(double A, double B, double C) {
		a = A;
		b = B;
		c = C;
	}

	public double Objem() {
		double x = a * b * c;
		return x;
	}

	public double Povrch() {
		double y = 2 * (a * b + a * c + b * c);
		return y;
	}

	public String toString() {
		return "Objem kvádru je " + Objem() + " -- Povrch je " + Povrch();
	}

}
