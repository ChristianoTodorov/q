
public class V�lec {

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

	V�lec() {
	}

	V�lec(double polomer, double vyska) {
		r = polomer;
		v = vyska;
	}

	public double Objem() {
		double x = Math.PI * Math.pow(r, 2) * v;
		return x;
	}

	public double Povrch() {
		double y = 2 * Math.PI * r * (r + v);
		return y;
	}

	public String toString() {
		return "Objem v�lce je " + Objem() + " -- Povrch je " + Povrch();
	}

}
