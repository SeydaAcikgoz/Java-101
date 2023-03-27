package patika;

import java.util.Scanner;

public class atm_ornegi {
	public static void main(String[] args) {

		// kullanıcıya giris icin 3 kere islem hakki verildi
		Scanner input = new Scanner(System.in);

		String userName, password;
		int right = 3;
		int balance = 1500;
		int select;

		while (right > 0) {
			System.out.print("Kullanici Adiniz :");
			userName = input.nextLine();
			System.out.print("Parolaniz : ");
			password = input.nextLine();

			if (userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Hosgeldiniz!");
				do {
					System.out.println("\n1-Para yatirma\n" + "2-Para Cekme\n" + "3-Bakiye Sorgula\n" + "4-Cikis Yap");
					System.out.print("\nLutfen yapmak istediginiz islemi seciniz : ");
					select = input.nextInt();
					switch (select) {
					case 1:
						System.out.print("Para miktari : ");
						int price = input.nextInt();
						balance += price;
						break;

					case 2:
						System.out.print("Para miktari : ");
						price = input.nextInt();
						if (price > balance) {
							System.out.println("Bakiye yetersiz.");
						} else {
							balance -= price;
						}
						break;
					case 3:
						System.out.println("Bakiyeniz : " + balance);
						break;
					case 4:
						System.out.println("Tekrar gorusmek uzere.");
						return;
					}
				}while (select != 4);
			} else {
				right--;
				System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
				if (right == 0) {
					System.out.println("Hesabiniz bloke olmustur lutfen banka ile iletisime geciniz.");
				} else {
					System.out.println("\nKalan Hakkiniz : " + right);
				}
			}
		}
	}
}