import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner xd = new Scanner(System.in);
		System.out.println("Zadejte cel� ��slo reprezentuj�c� doln� hranici sou�tu : ");
		int min = xd.nextInt();
		System.out.println("Zadejte cel� ��slo reprezentuj�c� horn� hranici sou�tu : ");
		int max = xd.nextInt();
		if(min>max) {
			int k = min;
			min = max;
			max = k;
		}
		Pattern p = Pattern.compile("[*/-//+%]{1}[0-9]+");
		Matcher m;String op;
		do {
		System.out.println("Zadejte zna�ku mat. operace a ��slo (nap�. *2) : ");
		op = xd.next();
		m = p.matcher(op);
		}while(!m.find());
		String k = Character.toString(op.charAt(1));
		int num = Integer.parseInt(k);
		int result = 0;int sum;
			switch(op.charAt(0)) {
			case '*':
				for(int i = min;i<=max;i++) {
					sum = i*num;
					result += sum;
					System.out.print(" "+i+"*"+num+" +");
				}
				break;
			case '/':
				for(int i = min;i<=max;i++) {
					sum = i/num;
					result += sum;
					System.out.print(" "+i+"/"+num+" +");
				}
				break;
			case '+':
				for(int i = min;i<=max;i++) {
					sum = i+num;
					result += sum;
					System.out.print(" "+i+"+"+num+" +");
				}
				break;
			case '-':
				for(int i = min;i<=max;i++) {
					sum = i-num;
					result += sum;
					System.out.print(" "+i+"-"+num+" +");
				}
				break;
			case '%':
				for(int i = min;i<=max;i++) {
					sum = i%num;
					result += sum;
					System.out.print(" "+i+"%"+num+" +");
				}
				break;
			}
		System.out.println(" = "+result+" !");
		xd.close();
	}
}
