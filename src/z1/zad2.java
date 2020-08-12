package z1;
import java.util.Scanner;

public class zad2 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Podaj pierwsza liczbe: ");
		int l1 = input.nextInt();
		System.out.print("Podaj druga liczbe: ");
		int l2 = input.nextInt();
		int sum = l1 + l2;
		System.out.println("Suma podanych liczb: " + sum);
		input.close();
	}
}
