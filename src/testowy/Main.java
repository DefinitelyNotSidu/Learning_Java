package testowy;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	Kot kazik = new Kot();
	System.out.print("Co chcesz zrobic ze swoim kotem?");
	System.out.print("\n1. Daj jesc");
	System.out.print("\n2. Baw sie");
	System.out.print("\n3. Daj odpoczac");
	System.out.print("\n4. Sprawdz stan kota");
	System.out.println("\n5. Zakoncz");
	
	int wyb;
	int czas;
	
	do
	{
		wyb = in.nextInt();
		switch (wyb)
		{
		case 1:
			kazik.karm();
			break;
		case 2:
			System.out.print("Ile chcesz sie bawic z kotem?: ");
			czas = in.nextInt();
			kazik.bawSie(czas);
			break;
		case 3:
			System.out.print("Ile kociak ma spac?");
			czas = in.nextInt();
			kazik.dajSpac(czas);
			break;
		case 4:
			kazik.status();
			break;
		case 5:
			System.out.print("dajesz kotu spokoj.");
			break;
		default:
			System.out.println("Cos zjebales... nie ma takiej opcji");
		}

		
		
		
	} while (wyb != 5);
	in.close();
	}
	
}
