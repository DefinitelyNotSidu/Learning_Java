package z1;
import java.util.Scanner;

public class zad1 {
	/*(public static void main(String[] args)
	{
		System.out.println("Szery gej");
		
	}*/
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Podaj swoje imie:   ");
		String imie = input.next();
		System.out.print("Podaj swoje nazwisko:   ");
		String nazwisko = input.next();
		System.out.println("\n\nSiema \n" + imie + " " + nazwisko);
		input.close();
	}

}
