package patika;

import java.util.Scanner;

public class kdv_tutari_hesaplama {
	public static void main(String[] args) {
		
		double tutar,kdvOran=0.18,kdvTutar,kdvliTutar;
		Scanner veri=new Scanner(System.in);
		
		System.out.print("Tutari giriniz:");
		tutar=veri.nextDouble();
		
		kdvTutar=tutar*kdvOran;
		kdvliTutar=tutar+kdvTutar;
		
		System.out.println("Kdv'siz tutar:"+tutar);
		System.out.println("Kdv orani tutar:"+kdvOran);
		System.out.println("Kdv tutari:"+kdvTutar);
		System.out.println("Kdv'li tutar:"+kdvliTutar);
	}
}
