import java.io.File;
import java.util.Scanner;

public class CreateFileExample {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Where should the file be created ?");
		System.out.println("Enter the path :");
		String path = sc.nextLine();
		System.out.println("Enter the name of the file :");
		String name = sc.nextLine();
		System.out.println("Enter the type of the program :");
		String type = sc.nextLine();

		try {
			File file = new File(path + name + type);// "\""
			boolean isCreated = file.createNewFile();
			if (isCreated) {
				System.out.println("File has been created successfully");
			} else {
				System.out.println("File already present at the specified location");
			}
		} catch (Exception e) {
			System.out.println("Exception Occurred: ");
			e.printStackTrace();
		}
	}
}