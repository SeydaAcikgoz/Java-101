import java.util.Scanner;

public class sinif_gecme_ornegi {

	public static void main(String[] args) {
		int mat, fizik, turkce, kimya, muzik, toplam = 0;
		float ort = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Matematik notunuzu giriniz:");
		mat = input.nextInt();
		if (mat >= 0 && mat <= 100) {
			toplam += mat;
		}

		System.out.print("Fizik notunuzu giriniz:");
		fizik = input.nextInt();
		if (fizik >= 0 && fizik <= 100) {
			toplam += fizik;
		}

		System.out.print("Turkce notunuzu giriniz:");
		turkce = input.nextInt();
		if (turkce >= 0 && turkce <= 100) {
			toplam += turkce;
		}

		System.out.print("Kimya notunuzu giriniz:");
		kimya = input.nextInt();
		if (kimya >= 0 && kimya <= 100) {
			toplam += kimya;
		}

		System.out.print("Muzik notunuzu giriniz:");
		muzik = input.nextInt();
		if (muzik >= 0 && muzik <= 100) {
			toplam += muzik;
		}

		ort = toplam / 5;
		System.out.print("Ortalamaniz:" + ort);

		if (ort <= 55) {
			System.out.print("\nSinifta kaldiniz,seneye gorusmek uzere.");
		}else {
			System.out.print("\nTebrikler,sinif gectiniz.");
		}

	}
