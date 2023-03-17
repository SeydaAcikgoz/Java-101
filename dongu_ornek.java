package patika;

import java.util.Scanner;

public class dongu_ornek {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Bir sayi giriniz:");
		int sayi = input.nextInt();

		for (int i = 0; i < sayi; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.print(i + "\t");
			}
		}
	}
}
