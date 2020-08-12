package z1;
import java.util.Scanner;
public class zad5 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Podaj pierwsza licze: ");
		int l1 = input.nextInt();
		System.out.print("Podaj druga liczbe: ");
		int l2 = input.nextInt();
		System.out.println("\n\n" + l1 + "x" + l2 + "=" + l1*l2);
		input.close();
	}
}
