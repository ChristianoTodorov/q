import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		Scanner xd = new Scanner(System.in);
		int num;
		do {
		System.out.println("Zadejte min. dvoum�stn� ��slo ke kontrole : ");
		num = xd.nextInt();
		}while(num<10&&num>-10);
		
		String num1 = Integer.toString(num);
		String num2 = "";
		for(int i = num1.length()-1;i!=-1;i--) {
				num2 += num1.charAt(i);	
		}
		if(num1.equals(num2)) 
			System.out.println("��slo je polindromick� !");
		else
			System.out.println("��slo nen� polindromick�");		
	}

}