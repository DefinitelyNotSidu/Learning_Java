package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj nazwe pliku:");
		String name = input.next();
		name += ".txt";
		input.close();
		
		try {
			File myObj = new File(name);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch(FileNotFoundException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}
