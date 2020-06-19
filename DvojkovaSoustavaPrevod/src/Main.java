import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner xd = new Scanner(System.in);

		int s10 = 0;
		System.out.println("Zadejte ��slo v dvojkov� soustav� :");
		String s2 = xd.next();

		String pattern = "[^01]";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(s2);
		if (m.find()) {
			System.out.println("Toto nen� dvojkov� soustava");
		}

		double q = s2.length() - 1;
		double add = Math.pow(2.0, q);
		for (int i = 0; i != s2.length(); i++) {
			if (s2.charAt(i) == '1') {
				s10 += add;
			}
			add /= 2;
		}
		System.out.println("Va�e ��slo p�eveden� do des�tkov� soustavy nos� hodnotu : " + s10);
	}

}