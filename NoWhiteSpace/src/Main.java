import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner xd = new Scanner(System.in);

		System.out.println("Napište libovolný text :");
		String k = xd.nextLine();
		int pocMezer = 0;
		for (int i = 0; i < k.length(); i++) {
			if (k.charAt(i) == ' ')
				pocMezer++;
		}
		k = k.replace(" ", "");
		System.out.println("Bylo nalezeno a vymazáno "+pocMezer+" mezer\nVáš text bez mezer : ");
		System.out.println(k);
		xd.close();
	}

}
