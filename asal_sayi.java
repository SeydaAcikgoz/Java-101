package patika;

import java.util.Scanner;

public class asal_sayi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int sonuc = asalSayi(number, number / 2);
		if (sonuc == 0)
			System.out.print(number + " asal sayi degildir\n");
		else
			System.out.print(number + " asal sayidir\n");

	}

	public static int asalSayi(int x, int i) {
		if (x < 2)
			return 0;
		if (i == 1)
			return 1;
		if (x % i == 0)
			return 0;
		return asalSayi(x, i - 1);
	}

}
