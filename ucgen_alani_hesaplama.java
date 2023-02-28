import java.util.Scanner;

public class ucgen_alani_hesaplama {

	public static void main(String[] args) {
		// u=(a+b+c)/2
		// alan*alan=u*(u-a)*(u-b)*(u-c)

		int a, b, c;
		Scanner veri = new Scanner(System.in);

		System.out.print("1.kenari giriniz:");
		a = veri.nextInt();

		System.out.print("2.kenari giriniz:");
		b = veri.nextInt();

		System.out.print("3.kenari giriniz:");
		c = veri.nextInt();

		double u = (a + b + c) / 2;
		double cevre = Math.sqrt(u * (u - a) * (u - b) * (u - c));

		System.out.println("Ucgenin cevresi:" + cevre);

	}

}
