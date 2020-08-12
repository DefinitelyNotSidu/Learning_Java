package z1;
import java.util.Scanner;

public class zad7 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj liczbe:");
		int a = in.nextInt();
		System.out.print("\n");
		
		for (int i = 0; i < 10; i++, System.out.println(a * i) );
		in.close();
	}
}
