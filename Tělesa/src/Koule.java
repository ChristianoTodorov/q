
public class Koule {
	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	Koule() {
	}

	Koule(double polomer) {
		r = polomer;
	}

	public double Objem() {
		return (4 / 3) * Math.PI * Math.pow(r, 3);
	}

	public double Povrch() {
		return 4 * Math.PI * Math.pow(r, 2);
	}

	public String toString() {
		return "Objem koule je " + Objem() + " -- Povrch je " + Povrch();
	}
}
