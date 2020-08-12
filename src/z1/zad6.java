package z1;
import java.util.Scanner;
public class zad6 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj pierwsza liczbe ");
		int l1 = input.nextInt();
		System.out.println("Podaj druga liczbe: ");
		int l2 = input.nextInt();
		System.out.println(l1 + "+" + l2 + "=" + (l1+l2));
		System.out.println(l1 + "-" + l2 + "=" + (l1-l2));
		System.out.println(l1 + "x" + l2 + "=" + (l1*l2));
		System.out.println(l1 + "/" + l2 + "=" + (l1/l2));
		System.out.println(l1 + " mod " + l2 + "=" + (l1%l2));
		input.close();
		
	}
}
