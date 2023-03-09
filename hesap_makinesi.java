import java.util.Scanner;

public class hesap_makinesi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Birinci sayiyi giriniz:");
		int n1 = input.nextInt();
		System.out.print("Ikinci sayiyi giriniz:");
		int n2 = input.nextInt();

		System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n5-Cikis");
		int select = input.nextInt();

		switch (select) {
		case 1: {
			System.out.println("Toplama sonucu:" + (n1 + n2));
			break;
		}

		case 2: {
			System.out.println("Toplama sonucu:" + (n1 - n2));
			break;
		}

		case 3: {
			System.out.println("Toplama sonucu:" + (n1 * n2));
			break;
		}

		case 4: {
			if (n2 == 0) {
				System.out.println("Bolen 0 olamaz!");
			} else {
				System.out.println("Toplama sonucu:" + (n1 / n2));
			}
			break;
		}
		case 5: {
			System.out.println("Cikis yapiliyor.");
			return;
		}

		default:
			System.out.println("Hatli islem!");
		}

	}
