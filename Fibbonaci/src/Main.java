import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void fibbonaci(ArrayList<Integer> a,int maxRange) {
		if(a.get(a.size()-1)+a.get(a.size()-2)<=maxRange) {
			a.add(a.get(a.size()-1)+a.get(a.size()-2));
			fibbonaci(a,maxRange);
		}
	}

	public static void main(String[] args) {
		Scanner xd = new Scanner(System.in); //45
		
		ArrayList<Integer> f = new ArrayList<Integer>();
		f.add(0);
		f.add(1);
		System.out.println("Zadejte maxim�ln� ��slo do kter�ho se fibbonaciho posloupnost m� zapsat :");
		int x = xd.nextInt();
		fibbonaci(f,x);
		
		System.out.println("Fibbonaciho posloupnost :"+f);
		
	}

}