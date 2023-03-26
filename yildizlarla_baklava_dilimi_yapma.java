package patika;

import java.util.Scanner;

public class yildizlarla_baklava_dilimi_yapma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Yukseklik kac satir olsun?(lutfen tek sayi giriniz)");
		int yukseklik = input.nextInt();
		// yukseklik her zaman tek sayi olur

		int yariyukseklik = (int) (yukseklik / 2) + 1;

		for (int i = 1; i <= yariyukseklik; i++) {
			for (int j = 1; j <= yariyukseklik - i; j++)
				System.out.print(" ");

			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");

			System.out.println();
		}

		for (int i = yariyukseklik - 1; i >= 1; i--) {
			for (int j = 1; j <= yariyukseklik - i; j++)
				System.out.print(" ");

			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");

			System.out.println();
		}
	}
}
