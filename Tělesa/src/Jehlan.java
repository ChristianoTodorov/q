
public class Jehlan {
	private double a, v;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getV() {
		return v;
	}

	public void setV(double v) {
		this.v = v;
	}

	Jehlan() {
	}

	Jehlan(double A, double vyska) {
		v = vyska;
		a = A;
	}

	public double Podstava() {
		return a * a;
	}

	public double ObsahPlaste() {
		double s = Math.pow(a, 2) + Math.pow(v, 2);
		double okasdwqer = 4 * (s + v + a);
		return okasdwqer;
	}

	public double Objem() {
		double x = (1 / 3) * Podstava() + v;
		return x;
	}

	public double Povrch() {
		return (Podstava() + ObsahPlaste());
	}

	public String toString() {
		return "Objem jehlanu je " + Objem() + " -- Povrch je " + Povrch();
	}
}