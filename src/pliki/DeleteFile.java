package pliki;
import java.io.File;
import java.util.Scanner;
public class DeleteFile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj nazwe pliku:");
		String name = input.next();
		name += ".txt";
		input.close();
		File myObj = new File(name);
		if (myObj.delete()) {
			System.out.println("Deleted the file: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}
	
	}
}
