package pliki;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj nazwe pliku:");
		String name = input.next();
		name+=".txt";
		System.out.println(name);
		input.close();
		try
		{
			File myObj = new File(name);
			if (myObj.createNewFile())
				{
					System.out.println("File created: " + myObj.getName());
				}
				else
				{
					System.out.println("File already exists.");
				}
			System.out.println(myObj.getAbsolutePath());
			
		} catch(IOException e)
		{
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		try {
			FileWriter myWriter = new FileWriter(name);
			myWriter.write("Ziobro, Ty kurwo jebana\n");
			myWriter.write("Przestan mi rodzine przesladowac");
			myWriter.close();
			System.out.println("Succesfully wrote to file");
			
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
	}
}
