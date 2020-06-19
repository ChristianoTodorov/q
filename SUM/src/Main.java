import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner xd = new Scanner(System.in);
		System.out.println("Zadejte celé èíslo reprezentující dolní hranici souètu : ");
		int min = xd.nextInt();
		System.out.println("Zadejte celé èíslo reprezentující horní hranici souètu : ");
		int max = xd.nextInt();
		if(min>max) {
			int k = min;
			min = max;
			max = k;
		}
		Pattern p = Pattern.compile("[*/-//+%]{1}[0-9]+");
		Matcher m;String op;
		do {
		System.out.println("Zadejte znaèku mat. operace a èíslo (napø. *2) : ");
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
