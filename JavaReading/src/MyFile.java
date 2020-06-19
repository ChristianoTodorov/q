import java.io.*;
import java.util.*;

public class MyFile {
static Scanner gg;
static Scanner xd;
	public static void main(String[] args) {

		try {
			gg = new Scanner(System.in);
			System.out.println("--CREATE-A-TEXT-FILE--");
			System.out.println("Jak se bude jmenovat váše složka ?");
			String name = gg.nextLine();
			System.out.println("Co chcete dovnitø napsat?");
			String ads = gg.nextLine();
			
			Formatter fr = new Formatter(name + ".txt");    // the file will be automatically created in the java folder
			fr.format("%s %s", ads, "\n\n");                // C:\Users\Hrisi\eclipse-workspace\
			fr.format("%.3f %d %s", 2.3, 69, "\n");         // %.3 = 3 nums after .
			fr.format("%d", 420);                           // %s = String / %f = double / %d = int / \n = nextLine
			fr.close();

			File x = new File(name + ".txt");
			xd = new Scanner(x);
			while (xd.hasNext()) {
				System.out.println(xd.next());
			}
			//xd.close();
		} catch (IOException q) {
			System.out.println("An error associeted with the file has occured");
			System.out.println(q);
			q.printStackTrace();
		} catch (Exception e) {
			System.out.println("!!! ERROR !!!");
			System.out.println(e);
			
			
		}
	}
}