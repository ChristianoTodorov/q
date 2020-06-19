import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner xd = new Scanner(System.in);
		
			System.out.println("Zadejte èas v evropském 24 hodinovém formátu :");
			String time = xd.nextLine();
			String secondNum = String.valueOf(time.charAt(1));
			int first = Integer.parseInt(String.valueOf(time.charAt(0)));
			if(secondNum.equals(":")) {
				System.out.println("Zapsaný èas je :\n "+first+" : "+String.valueOf(time.charAt(2))+String.valueOf(time.charAt(3))+" AM");
			}
			
			int second = Integer.parseInt(String.valueOf(time.charAt(1)));
			if(first==1&&second<2) {
				System.out.println("Zapsaný èas je :\n "+first+""+second+" : "+String.valueOf(time.charAt(3))+String.valueOf(time.charAt(4))+" AM");
			}else if(first<1){
				System.out.println("Zapsaný èas je :\n "+second+" : "+String.valueOf(time.charAt(3))+String.valueOf(time.charAt(4))+" AM");
			}
			String q = String.valueOf(time.charAt(0))+String.valueOf(time.charAt(1));
			if(Integer.parseInt(q)>12&&Integer.parseInt(q)<24) { //    12
				int num = Integer.parseInt(q)-12;
			System.out.println("Zapsaný èas je :\n "+num+" : "+String.valueOf(time.charAt(3))+String.valueOf(time.charAt(4))+" PM");
			}
			if(Integer.parseInt(q)==12) {
				System.out.println("Zapsaný èas je :\n 12 : "+String.valueOf(time.charAt(3))+String.valueOf(time.charAt(4))+" PM");
			}
			if(Integer.parseInt(q)==24) {
				System.out.println("Zapsaný èas je :\n 12 : "+String.valueOf(time.charAt(3))+String.valueOf(time.charAt(4))+" AM");
			}
			xd.close();
	}
}
