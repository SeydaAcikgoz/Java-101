package patika;

import java.util.Scanner;

public class dongu_ornek3 {

	public static void main(String[] args) {
		// Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana
		// yazdıran programı:

		Scanner input = new Scanner(System.in);

		System.out.print("Sinir degerini giriniz:");
		int sayi = input.nextInt();

		for (int i = 1; i <= sayi; i *= 4) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= sayi; i *= 5) {
			System.out.print(i + "\t");
		}

	}

}
