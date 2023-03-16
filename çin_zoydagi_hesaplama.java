package patika;

import java.util.Scanner;

public class çin_zoydagi_hesaplama {

	public static void main(String[] args) {
		/*
		 * Doğum Tarihi %12 = 0 ➜ Maymun
		 * Doğum Tarihi %12 = 1 ➜ Horoz
		 * Doğum Tarihi %12 = 2 ➜ Köpek
		 * Doğum Tarihi %12 = 3 ➜ Domuz
		 * Doğum Tarihi %12 = 4 ➜ Fare
		 * Doğum Tarihi %12 = 5 ➜ Öküz
		 * Doğum Tarihi %12 = 6 ➜ Kaplan
		 * Doğum Tarihi %12 = 7 ➜ Tavşan 
		 * Doğum Tarihi %12 = 8 ➜ Ejderha
		 * Doğum Tarihi %12 = 9 ➜ Yılan 
		 * Doğum Tarihi %12 = 10 ➜ At
		 * Doğum Tarihi %12 = 11 ➜ Koyun
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Dogum yilinizi giriniz:");
		int year=input.nextInt();
		
		int kalan=year%12;
		switch (kalan) {
		case 0: {
			System.out.print("Maymun");
			break;
		}
		
		case 1: {
			System.out.print("Horoz");
			break;
		}
		
		case 2: {
			System.out.print("Kopek");
			break;
		}
		
		case 3: {
			System.out.print("Domuz");
			break;
		}
		
		case 4: {
			System.out.print("Fare");
			break;
		}
		
		case 5: {
			System.out.print("Okuz");
			break;
		}
		
		case 6: {
			System.out.print("Kaplan");
			break;
		}
		
		case 7: {
			System.out.print("Tavsan");
			break;
		}
		
		case 8: {
			System.out.print("Ejderha");
			break;
		}
		
		case 9: {
			System.out.print("Yilan");
			break;
		}
		
		case 10: {
			System.out.print("At");
			break;
		}
		
		case 11: {
			System.out.print("Koyun");
			break;
		}
		
		
		default:
			System.out.print("Hata!");
		}

	}

}
