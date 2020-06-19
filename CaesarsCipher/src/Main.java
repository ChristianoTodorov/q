import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner xd = new Scanner(System.in);//36
		String abceda [] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		System.out.println("O kolik pozic chcete zprávu zašifrovat ?");
		int k = xd.nextInt();
		System.out.println("Napište zprávu kterou chcete zašifrovat pomocí Caesarovy šifry (používejte prosím pouze písmena z anglické abecedy) : ");
		String cipher = xd.nextLine()+xd.nextLine();
		String encoded = "";
		int poz = 0;
		for(int i = 0;i<cipher.length();i++) {
			String q = Character.toString(cipher.charAt(i));
			if(!q.equals(" ")) {
				for(int y = 0;y<abceda.length;y++) {	
				if(q.equals(abceda[y])) {
					poz=y;
				}
			}
			poz+=k;
			
			while(poz>=abceda.length) {
				poz -= abceda.length; 
			}
			encoded += abceda[poz];
			}else {
				encoded += " ";
			}
		}
		System.out.println("Vaše zašifrovaná zpráva : \n"+encoded);
		xd.close();
	}
}