import java.util.*;

public class Main {
	public static void main(String[] args) {
		int ok = 1;
		Scanner xd = new Scanner(System.in);
		while (ok == 1) {
			System.out.println(
					"[1]: Krychle, [2]: Kv�dr, [3]: Koule, [4]: V�lec, [5]: Ku�el, [6]: Jehlan, 7+: Konec programu");
			int choose = xd.nextInt();
			Krychle k1 = new Krychle(0);
			Kv�dr kv1 = new Kv�dr(0, 0, 0);
			Koule ko1 = new Koule(0);
			V�lec v1 = new V�lec(0, 0);
			Ku�el ku1 = new Ku�el(0, 0);
			Jehlan j1 = new Jehlan(0, 0);

			switch (choose) {
			case 1:
				System.out.println("Byla vybr�na mo�nost 1. - Krychle");
				System.out.println("Zadej d�lku strany a :");
				double x = xd.nextDouble();
				System.out.println("Zadan� d�lka stran a : " + x);
				k1.setStrA(x);
				System.out.println(k1);
				break;
			case 2:
				System.out.println("Byla vybr�na mo�nost 2. - Kv�dr");
				System.out.println("Zadej stranu a :");
				double a = xd.nextDouble();
				System.out.println("Zadej stranu b :");
				double b = xd.nextDouble();
				System.out.println("Zdaej stranu c :");
				double c = xd.nextDouble();
				System.out.println("Strana a = " + a + ", b = " + b + ", c = " + c);
				kv1.setA(a);
				kv1.setB(b);
				kv1.setC(c);
				System.out.println(kv1);
				break;
			case 3:
				System.out.println("Byla vybr�na mo�nost 3. - Koule");
				System.out.println("Zadej polom�r koule :");
				double p = xd.nextDouble();
				System.out.println("Polom�r koule : " + p);
				ko1.setR(p);
				System.out.println(ko1);
				break;
			case 4:
				System.out.println("Byla vybr�na mo�nost 4. - V�lec");
				System.out.println("Zadej polom�r :");
				double r = xd.nextDouble();
				System.out.println("Zadej v��ku :");
				double v = xd.nextDouble();
				System.out.println("Polom�r v�lce r = " + r + ", v��ka v = " + v);
				v1.setR(r);
				v1.setV(v);
				System.out.println(v1);
				break;
			case 5:
				System.out.println("Byla vybr�na mo�nost 5. - Ku�el");
				System.out.println("Zadej polom�r :");
				double pol = xd.nextDouble();
				System.out.println("Zadej v��ku :");
				double vys = xd.nextDouble();
				System.out.println("Polom�r ku�ela r = " + pol + ", v��ka v = " + vys);
				ku1.setR(pol);
				ku1.setV(vys);
				System.out.println(ku1);
				break;
			case 6:
				System.out.println("Byla vybr�na mo�nost 6. - Jehlan");
				System.out.println("Zadej d�lku stranu podstavy :");
				double strA = xd.nextDouble();
				System.out.println("Zadej v��ku :");
				double vy = xd.nextDouble();
				System.out.println("V��ka jehlanu v = " + vy + ", d�lka strany podstavy a = " + strA);
				j1.setA(strA);
				j1.setV(vy);
				System.out.println(j1);
				break;
			default:
				System.out.println("Byla vybr�na mo�nost 7+ - Ukon�en� programu");
				if (k1.Povrch() > j1.Povrch() && k1.Povrch() > ku1.Povrch() && k1.Povrch() > v1.Povrch()
						&& k1.Povrch() > ko1.Povrch() && k1.Povrch() > kv1.Povrch()) {
					System.out.println("Krychle m�la nejv�t�� povrch - " + k1.Povrch());
				}
				if (kv1.Povrch() > j1.Povrch() && kv1.Povrch() > ku1.Povrch() && kv1.Povrch() > v1.Povrch()
						&& kv1.Povrch() > ko1.Povrch() && kv1.Povrch() > k1.Povrch()) {
					System.out.println("Kv�dr m�l nejv�t�� povrch - " + kv1.Povrch());
				}
				if (ko1.Povrch() > j1.Povrch() && ko1.Povrch() > ku1.Povrch() && ko1.Povrch() > v1.Povrch()
						&& ko1.Povrch() > k1.Povrch() && ko1.Povrch() > kv1.Povrch()) {
					System.out.println("Koule m�la nejv�t�� povrch - " + ko1.Povrch());
				}
				if (v1.Povrch() > j1.Povrch() && v1.Povrch() > ku1.Povrch() && v1.Povrch() > k1.Povrch()
						&& v1.Povrch() > ko1.Povrch() && v1.Povrch() > kv1.Povrch()) {
					System.out.println("V�lec m�l nejv�t�� povrch - " + v1.Povrch());
				}
				if (ku1.Povrch() > j1.Povrch() && ku1.Povrch() > k1.Povrch() && ku1.Povrch() > v1.Povrch()
						&& ku1.Povrch() > ko1.Povrch() && ku1.Povrch() > kv1.Povrch()) {
					System.out.println("Ku�el m�l nejv�t�� povrch - " + ku1.Povrch());
				}
				if (j1.Povrch() > k1.Povrch() && j1.Povrch() > ku1.Povrch() && j1.Povrch() > v1.Povrch()
						&& j1.Povrch() > ko1.Povrch() && j1.Povrch() > kv1.Povrch()) {
					System.out.println("Jehlan m�l nejv�t�� povrch - " + j1.Povrch());
				}
				if (k1.Povrch() < j1.Povrch() && k1.Povrch() < ku1.Povrch() && k1.Povrch() < v1.Povrch()
						&& k1.Povrch() < ko1.Povrch() && k1.Povrch() < kv1.Povrch() && k1.Povrch() > 0) {
					System.out.println("Krychle m�la nejmen�� povrch - " + k1.Povrch());
				}
				if (kv1.Povrch() < j1.Povrch() && kv1.Povrch() < ku1.Povrch() && kv1.Povrch() < v1.Povrch()
						&& kv1.Povrch() < ko1.Povrch() && kv1.Povrch() < k1.Povrch() && kv1.Povrch() > 0) {
					System.out.println("Kv�dr m�l nejmen�� povrch - " + kv1.Povrch());
				}
				if (ko1.Povrch() < j1.Povrch() && ko1.Povrch() < ku1.Povrch() && ko1.Povrch() < v1.Povrch()
						&& ko1.Povrch() < k1.Povrch() && ko1.Povrch() < kv1.Povrch() && ko1.Povrch() > 0) {
					System.out.println("Koule m�la nejmen�� povrch - " + ko1.Povrch());
				}
				if (v1.Povrch() < j1.Povrch() && v1.Povrch() < ku1.Povrch() && v1.Povrch() < k1.Povrch()
						&& v1.Povrch() < ko1.Povrch() && v1.Povrch() < kv1.Povrch() && v1.Povrch() > 0) {
					System.out.println("V�lec m�l nejmen�� povrch - " + v1.Povrch());
				}
				if (ku1.Povrch() < j1.Povrch() && ku1.Povrch() < k1.Povrch() && ku1.Povrch() < v1.Povrch()
						&& ku1.Povrch() < ko1.Povrch() && ku1.Povrch() < kv1.Povrch() && ku1.Povrch() > 0) {
					System.out.println("Ku�el m�l nejmen�� povrch - " + ku1.Povrch());
				}
				if (j1.Povrch() < k1.Povrch() && j1.Povrch() < ku1.Povrch() && j1.Povrch() < v1.Povrch()
						&& j1.Povrch() < ko1.Povrch() && j1.Povrch() < kv1.Povrch() && j1.Povrch() > 0) {
					System.out.println("Jehlan m�l nejmen�� povrch - " + j1.Povrch());
				}
				// ted jsem si uvedomil ze tohle jde ud�lat na jeden ��dek ...
				// System.out.println(Math.max(j1.Povrch(), k1.Povrch(), ku1.Povrch(),
				// v1.Povrch()));
				System.out.println("Nejv�t�� objem - " + Math.max(Math.max(j1.Objem(), k1.Objem()),
						Math.max(Math.max(ko1.Objem(), v1.Objem()), Math.max(kv1.Objem(), ku1.Objem()))));
				System.out.println("Nejmen�� objem - " + Math.min(Math.min(j1.Objem(), k1.Objem()),
						Math.min(Math.min(ko1.Objem(), v1.Objem()), Math.min(kv1.Objem(), ku1.Objem()))));
				ok = 2;
			}

			System.out.println();
		}
		xd.close();
	}
}
