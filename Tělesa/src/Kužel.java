
public class Ku�el {
	private double r, v;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getV() {
		return v;
	}

	public void setV(double v) {
		this.v = v;
	}

	Ku�el() {
	}

	Ku�el(double polomer, double vyska) {
		r = polomer;
		v = vyska;
	}

	public double Spadnice() {
		double x = Math.sqrt(Math.pow(r, 2) + Math.pow(v, 2));
		return x;
	}

	public double Objem() {
		double y = (1 / 3) * Math.PI * Math.pow(r, 2) * v;
		return y;
	}

	public double Povrch() {
		return Math.PI * r * (r + Spadnice());
	}

	public String toString() {
		return "Objem ku�ele je " + Objem() + " -- Povrch je " + Povrch();
	}
}
