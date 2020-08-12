package z1;
import java.util.Scanner;

public class zad3 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("podaj pierwsza liczbe: ");
		double l1 = input.nextDouble();
		System.out.print("Podaj druga liczbe: ");
		double l2 = input.nextDouble();
		double result = l1 / l2;
		System.out.print("\n\nWynik dzielenia: " + result);
		input.close();
	}
}
