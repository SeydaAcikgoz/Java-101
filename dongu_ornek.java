import java.util.Scanner;

public class dongu_ornek {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int toplam=0,adet=0;
		
		System.out.print("Bir sayi giriniz:");
		int sayi = input.nextInt();

		for (int i = 0; i < sayi; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				toplam+=i;
				adet++;
				System.out.print(i + "\t");
			}
		}
		
		System.out.println("Ortalama:"+(toplam/adet));
	}
}
