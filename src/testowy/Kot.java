package testowy;

public class Kot {
	private int hp = 100;
	private int humor = 50;
	private int glod = 0;
	private int zmeczenie = 0;
	void bawSie(int czas)
	{
		if (zmeczenie < 90)
		{
			humor += czas;
			
			glod += czas/2;
			if (glod > 100) {
				glod = 100;
				hp -= 20;
			}
			else if (glod == 100) hp -= 0;
			else hp +=1;
			
			zmeczenie += czas*2;
			if (zmeczenie > 100)
			{
				zmeczenie = 100;
			}
			System.out.println("Pobawiles sie z kotkiem przez " + czas + "minut.");
		}
		else
		{
			humor -= 20;
			if (humor < 0) humor = 0;
			System.out.println("Kot jest zmeczony i nie chce sie bawic.");
		}
	}
	void karm()
	{
		if (glod == 0)
		{
			System.out.println("Kot nie jest glodny.");
		}
		else
		{
			glod = 0;
			System.out.println("Nakarmiles kota.");
		}
	}
	void dajSpac(int czas)
	{
		if (zmeczenie > 50)
		{
			zmeczenie -= czas;
			glod += czas;
			if (glod > 100) {
				glod = 100;
				hp -= 20;
			}
			else if (glod == 100) hp -= 0;
			else hp += 3;
			System.out.println("Kot spal" + + czas + "minut");
		}
		else
		{
			System.out.println("Kot nie jest zmeczony.");
		}
	}
	void status()
	{
		System.out.println("hp: " + hp);
		System.out.println("humor: " + humor);
		System.out.println("glod: " + glod);
		System.out.println("zmeczenie: " + zmeczenie);
	}
}
