import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner xd = new Scanner(System.in);
		System.out.println("Zadejte text :");
		String vstup = xd.nextLine();
		vstup.trim();
		Pattern p = Pattern.compile(" ?[a-zA-Z����������]+ ?");
		Matcher m = p.matcher(vstup);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		int index = 0;
		int sum = 0;
		while(m.find()) {
			String k = m.group().trim();
			a.add(k.length());
			sum += a.get(a.size()-1);
			index++;
			
		}
		
		System.out.println("Po�et slov : "+a.size());
		double lol = (double)sum/a.size();
		double w = Math.round(lol*1000.0)/1000.0;
		System.out.println("Pr�m�rn� velikost slova : "+w+" p�smena");
	}
	
}