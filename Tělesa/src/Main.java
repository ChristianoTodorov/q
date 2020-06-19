import java.util.*;

public class Main {
	public static void main(String[] args) {
		int ok = 1;
		Scanner xd = new Scanner(System.in);
		while (ok == 1) {
			System.out.println(
					"[1]: Krychle, [2]: Kvádr, [3]: Koule, [4]: Válec, [5]: Kužel, [6]: Jehlan, 7+: Konec programu");
			int choose = xd.nextInt();
			Krychle k1 = new Krychle(0);
			Kvádr kv1 = new Kvádr(0, 0, 0);
			Koule ko1 = new Koule(0);
			Válec v1 = new Válec(0, 0);
			Kužel ku1 = new Kužel(0, 0);
			Jehlan j1 = new Jehlan(0, 0);

			switch (choose) {
			case 1:
				System.out.println("Byla vybrána možnost 1. - Krychle");
				System.out.println("Zadej délku strany a :");
				double x = xd.nextDouble();
				System.out.println("Zadaná délka stran a : " + x);
				k1.setStrA(x);
				System.out.println(k1);
				break;
			case 2:
				System.out.println("Byla vybrána možnost 2. - Kvádr");
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
				System.out.println("Byla vybrána možnost 3. - Koule");
				System.out.println("Zadej polomìr koule :");
				double p = xd.nextDouble();
				System.out.println("Polomìr koule : " + p);
				ko1.setR(p);
				System.out.println(ko1);
				break;
			case 4:
				System.out.println("Byla vybrána možnost 4. - Válec");
				System.out.println("Zadej polomìr :");
				double r = xd.nextDouble();
				System.out.println("Zadej výšku :");
				double v = xd.nextDouble();
				System.out.println("Polomìr válce r = " + r + ", výška v = " + v);
				v1.setR(r);
				v1.setV(v);
				System.out.println(v1);
				break;
			case 5:
				System.out.println("Byla vybrána možnost 5. - Kužel");
				System.out.println("Zadej polomìr :");
				double pol = xd.nextDouble();
				System.out.println("Zadej výšku :");
				double vys = xd.nextDouble();
				System.out.println("Polomìr kužela r = " + pol + ", výška v = " + vys);
				ku1.setR(pol);
				ku1.setV(vys);
				System.out.println(ku1);
				break;
			case 6:
				System.out.println("Byla vybrána možnost 6. - Jehlan");
				System.out.println("Zadej délku stranu podstavy :");
				double strA = xd.nextDouble();
				System.out.println("Zadej výšku :");
				double vy = xd.nextDouble();
				System.out.println("Výška jehlanu v = " + vy + ", délka strany podstavy a = " + strA);
				j1.setA(strA);
				j1.setV(vy);
				System.out.println(j1);
				break;
			default:
				System.out.println("Byla vybrána možnost 7+ - Ukonèení programu");
				if (k1.Povrch() > j1.Povrch() && k1.Povrch() > ku1.Povrch() && k1.Povrch() > v1.Povrch()
						&& k1.Povrch() > ko1.Povrch() && k1.Povrch() > kv1.Povrch()) {
					System.out.println("Krychle mìla nejvìtší povrch - " + k1.Povrch());
				}
				if (kv1.Povrch() > j1.Povrch() && kv1.Povrch() > ku1.Povrch() && kv1.Povrch() > v1.Povrch()
						&& kv1.Povrch() > ko1.Povrch() && kv1.Povrch() > k1.Povrch()) {
					System.out.println("Kvádr mìl nejvìtší povrch - " + kv1.Povrch());
				}
				if (ko1.Povrch() > j1.Povrch() && ko1.Povrch() > ku1.Povrch() && ko1.Povrch() > v1.Povrch()
						&& ko1.Povrch() > k1.Povrch() && ko1.Povrch() > kv1.Povrch()) {
					System.out.println("Koule mìla nejvìtší povrch - " + ko1.Povrch());
				}
				if (v1.Povrch() > j1.Povrch() && v1.Povrch() > ku1.Povrch() && v1.Povrch() > k1.Povrch()
						&& v1.Povrch() > ko1.Povrch() && v1.Povrch() > kv1.Povrch()) {
					System.out.println("Válec mìl nejvìtší povrch - " + v1.Povrch());
				}
				if (ku1.Povrch() > j1.Povrch() && ku1.Povrch() > k1.Povrch() && ku1.Povrch() > v1.Povrch()
						&& ku1.Povrch() > ko1.Povrch() && ku1.Povrch() > kv1.Povrch()) {
					System.out.println("Kužel mìl nejvìtší povrch - " + ku1.Povrch());
				}
				if (j1.Povrch() > k1.Povrch() && j1.Povrch() > ku1.Povrch() && j1.Povrch() > v1.Povrch()
						&& j1.Povrch() > ko1.Povrch() && j1.Povrch() > kv1.Povrch()) {
					System.out.println("Jehlan mìl nejvìtší povrch - " + j1.Povrch());
				}
				if (k1.Povrch() < j1.Povrch() && k1.Povrch() < ku1.Povrch() && k1.Povrch() < v1.Povrch()
						&& k1.Povrch() < ko1.Povrch() && k1.Povrch() < kv1.Povrch() && k1.Povrch() > 0) {
					System.out.println("Krychle mìla nejmenší povrch - " + k1.Povrch());
				}
				if (kv1.Povrch() < j1.Povrch() && kv1.Povrch() < ku1.Povrch() && kv1.Povrch() < v1.Povrch()
						&& kv1.Povrch() < ko1.Povrch() && kv1.Povrch() < k1.Povrch() && kv1.Povrch() > 0) {
					System.out.println("Kvádr mìl nejmenší povrch - " + kv1.Povrch());
				}
				if (ko1.Povrch() < j1.Povrch() && ko1.Povrch() < ku1.Povrch() && ko1.Povrch() < v1.Povrch()
						&& ko1.Povrch() < k1.Povrch() && ko1.Povrch() < kv1.Povrch() && ko1.Povrch() > 0) {
					System.out.println("Koule mìla nejmenší povrch - " + ko1.Povrch());
				}
				if (v1.Povrch() < j1.Povrch() && v1.Povrch() < ku1.Povrch() && v1.Povrch() < k1.Povrch()
						&& v1.Povrch() < ko1.Povrch() && v1.Povrch() < kv1.Povrch() && v1.Povrch() > 0) {
					System.out.println("Válec mìl nejmenší povrch - " + v1.Povrch());
				}
				if (ku1.Povrch() < j1.Povrch() && ku1.Povrch() < k1.Povrch() && ku1.Povrch() < v1.Povrch()
						&& ku1.Povrch() < ko1.Povrch() && ku1.Povrch() < kv1.Povrch() && ku1.Povrch() > 0) {
					System.out.println("Kužel mìl nejmenší povrch - " + ku1.Povrch());
				}
				if (j1.Povrch() < k1.Povrch() && j1.Povrch() < ku1.Povrch() && j1.Povrch() < v1.Povrch()
						&& j1.Povrch() < ko1.Povrch() && j1.Povrch() < kv1.Povrch() && j1.Povrch() > 0) {
					System.out.println("Jehlan mìl nejmenší povrch - " + j1.Povrch());
				}
				// ted jsem si uvedomil ze tohle jde udìlat na jeden øádek ...
				// System.out.println(Math.max(j1.Povrch(), k1.Povrch(), ku1.Povrch(),
				// v1.Povrch()));
				System.out.println("Nejvìtší objem - " + Math.max(Math.max(j1.Objem(), k1.Objem()),
						Math.max(Math.max(ko1.Objem(), v1.Objem()), Math.max(kv1.Objem(), ku1.Objem()))));
				System.out.println("Nejmenší objem - " + Math.min(Math.min(j1.Objem(), k1.Objem()),
						Math.min(Math.min(ko1.Objem(), v1.Objem()), Math.min(kv1.Objem(), ku1.Objem()))));
				ok = 2;
			}

			System.out.println();
		}
		xd.close();
	}
}
