import java.util.Scanner;

public class kullanici_girisi {

	public static void main(String[] args) {
		String userName, password;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanici adiniz:");
		userName=input.nextLine();
		
		System.out.print("Sifreniz:");
		password=input.nextLine();
		
		if(userName.equals("patika") && password.equals(("java123"))){
			System.out.println("Giris yaptiniz.");
		}else if(userName.equals("patika") && !password.equals(("java123"))){
			System.out.println("Sifreniz yanlis!Sifrenizi sifirlamak ister misiniz?");
			boolean karar=input.nextBoolean();
			if(karar) {
				System.out.println("Yeni sifrenizi giriniz:");
				String newPassword=input.next();
				if(newPassword.equals("java123")) {
					System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz." );
				}else {
					System.out.println("Sifre olusturuldu.");
				}
			}
		}else {
			System.out.println("Giris yapilamadi.");
		}

	}
