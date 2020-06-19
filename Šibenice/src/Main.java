import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int trest = 0;
		int vyhra = 0;
		
		String[] databaze = {"auto", "počítač", "internet", "škola", "hra", "šibenice", "koule","jablko"};

		String slovo = databaze[(int)(Math.random()*databaze.length)];
		char[] postup = new char[slovo.length()];
		
		for(int i=0;i!=slovo.length();i++) {
			postup[i] = '-';
			
		}
		while (trest!=7&&vyhra!=slovo.length()){
			for(char c:postup)
				System.out.printf("%c",c);
			System.out.printf("\nZadejte písmeno: ");
			String volba = sc.nextLine().toLowerCase();

				if(slovo.contains(volba)){
				  for(int i=0;i!=slovo.length();i++)
				    if(volba.equals(Character.toString(slovo.charAt(i)))&&postup[i]!=slovo.charAt(i)){ //pokud input je správné písmeno ze slova a to písmeno už nebylo uhádnuto předtím
				        postup[i]=slovo.charAt(i); // odhalíme písmeno a přidáme bod výhry
				        vyhra+=1;
				    }
				}else
				  trest+=1;
		switch (trest){
		 case 7:
		      System.out.println("      ___________\n"
		                       + "     ││        I\n"
		                       + "     ││      (xx)\n"
		                       + "     ││        │\n"
		                       + "     ││       /│\\\n"
		                       + "     ││        │\n"
		                       + "     ││       / \\\n"
		                       + "    .---.\n"
		                       + "   /     \\");
		      System.out.println("Prohrál jste!\n"
		               + "Hledané slovo bylo: " + slovo);
		      break;
		  case 6:
		      System.out.println("      ___________\n"
		                       + "     ││        I\n"
		                       + "     ││      (xx)\n"
		                       + "     ││        │\n"
		                       + "     ││        │\n"
		                       + "     ││        │\n"
		                       + "     ││       / \\\n"
		                       + "    .---.\n"
		                       + "   /     \\");
		      break;
		  case 5:
		      System.out.println("      ___________\n"
		                       + "     ││        I\n"
		                       + "     ││       ( )\n"
		                       + "     ││        │\n"
		                       + "     ││        │\n"
		                       + "     ││        │\n"
		                       + "     ││\n"
		                       + "    .---.\n"
		                       + "   /     \\");
		      break;
		  case 4:
		      System.out.println("      ___________\n"
		                       + "     ││        I\n"
		                       + "     ││       ( )\n"
		                       + "     ││\n"
		                       + "     ││\n"
		                       + "     ││\n"
		                       + "     ││\n"
		                       + "    .---.\n"
		                       + "   /     \\");
		      break;
		  case 3:
		      System.out.println("      ___________\n"
		                       + "     ││        I\n"
		                       + "     ││\n"
		                       + "     ││\n"
		                       + "     ││\n"
		                       + "     ││\n"
		                       + "     ││\n"
		                       + "    .---.\n"
		                       + "   /     \\");
		      break;
		  case 2:
		      System.out.println("\n     ││\n"
		                       + "     ││\n"
		                       + "     ││\n"
		                       + "     ││\n"
		                       + "     ││\n"
		                       + "     ││\n"
		                       + "    .---.\n"
		                       + "   /     \\");
		      break;
		  case 1:
		      System.out.println("\n\n\n\n\n\n\n    .---.\n"+"   /     \\");
		      break;
		}
	}
		if (trest != 7) {
			 System.out.println(slovo+"\n"+"Vyhrál jste!");
		}	
	}
}
