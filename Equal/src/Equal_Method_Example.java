import java.util.Scanner;

public class Equal_Method_Example {

	public static void main(String[] args) {
		hashCode_and_EqualMethod qw = new hashCode_and_EqualMethod();
		hashCode_and_EqualMethod wq = new hashCode_and_EqualMethod();

		@SuppressWarnings("resource")
		Scanner xd = new Scanner(System.in);
		System.out.println("Returning if text equals to another text");

		System.out.println("Type any text :");
		String word = xd.nextLine();
		System.out.println("Type second text to compare :");
		String slovo = xd.next();

		System.out.println("Comparing " + word + " with " + slovo);
		System.out.println("The words are equal = "+qw.equals(wq));
		if (qw.equals(wq)) {
			System.out.println("The number of written letters and numbers is the same");
		} else {
			System.out.println("The number of written letters and numbers in not the same");
		}
		
	}
}
