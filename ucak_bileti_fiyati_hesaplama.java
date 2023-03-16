package patika;

import java.util.Scanner;

public class ucak_bileti_fiyati_hesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double perDistance = 0.1;

		System.out.print("Mesafeyi km cinsinden giriniz:");
		double mesafe = input.nextDouble();

		System.out.print("Yasinizi giriniz:");
		int yas = input.nextInt();

		System.out.print("Tek yon(1) mi,gidis-donus(2) mu?:");
		int tip = input.nextInt();
		if (tip != 1 || tip != 2) {
			System.out.print("Hatali Veri Girdiniz !");
		}

		double ucret = mesafe * perDistance;

		if (tip == 1) {
			if(yas<12) {
				ucret-=ucret*50/100;
			}
			else if(yas>=12 && yas<=24) {
				ucret-=ucret*10/100;
			}
			else if(yas>=65) {
				ucret-=ucret*30/100;
			}
		}
		else if (tip == 2) {
			if(yas<12) {
				ucret-=ucret*50/100;
				ucret-=ucret*20/100;
			}
			else if(yas>=12 && yas<=24) {
				ucret-=ucret*10/100;
				ucret-=ucret*20/100;
			}
			else if(yas>=65) {
				ucret-=ucret*30/100;
				ucret-=ucret*20/100;
			}
		}
		
		System.out.print("Ucret:"+ucret);

	}

}
