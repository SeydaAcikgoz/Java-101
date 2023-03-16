package patika;

import java.util.Scanner;

public class uc_sayiyi_siralama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Sayi giriniz:");
		int sayi1 = input.nextInt();

		System.out.print("Sayi giriniz:");
		int sayi2 = input.nextInt();

		System.out.print("Sayi giriniz:");
		int sayi3 = input.nextInt();

		if ((sayi1 < sayi2) && (sayi1 < sayi3)) {
			if (sayi2 < sayi3) {
				System.out.print(sayi1 + " < " + sayi2 + " < " + sayi3);
			}
			else {
				System.out.print(sayi1 + " < " + sayi3 + " < " + sayi2);
			}
		}
		
		else if ((sayi2 < sayi1) && (sayi2 < sayi3)) {
			if (sayi1 < sayi3) {
				System.out.print(sayi2 + " < " + sayi1 + " < " + sayi3);
			}
			else {
				System.out.print(sayi2 + " < " + sayi3 + " < " + sayi1);
			}
		}
		
		else {
			if (sayi1 < sayi2) {
				System.out.print(sayi3 + " < " + sayi1 + " < " + sayi2);
			}
			else {
				System.out.print(sayi3 + " < " + sayi2 + " < " + sayi1);

			}
		}

	}

}
