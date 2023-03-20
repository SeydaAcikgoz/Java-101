import java.util.Scanner;

public class dongu_ornek2 {

	public static void main(String[] args) {
		// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
		// ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı:

		Scanner input = new Scanner(System.in);
		int toplam = 0, sayi;

		do {
			System.out.print("\nBir sayi giriniz:");
			sayi = input.nextInt();
			if (sayi % 2 == 0 && sayi % 4 == 0) {
				System.out.print(sayi + "\t");
				toplam += sayi;
			}
		} while (sayi % 2 == 0);

		System.out.print("Toplam:" + toplam);

	}

}
