package not_ortalamasi;

import java.util.Scanner;

public class not_ortalamasi_hesapla {

	public static void main(String[] args) {
		
		Scanner veri= new Scanner(System.in);
		int mat,fizik,kimya,turkce,tarih,muzik;
		
		System.out.print("Matematik notunuzu giriniz:");
		mat=veri.nextInt();
		
		System.out.print("Fizik notunuzu giriniz:");
		fizik=veri.nextInt();
		
		System.out.print("Kimya notunuzu giriniz:");
		kimya=veri.nextInt();
		
		System.out.print("Turkce notunuzu giriniz:");
		turkce=veri.nextInt();
		
		System.out.print("Tarih notunuzu giriniz:");
		tarih=veri.nextInt();
		
		System.out.print("Muzik notunuzu giriniz:");
		muzik=veri.nextInt();
		
		float ortalama=(mat+fizik+kimya+turkce+tarih+muzik)/6;
		System.out.println("Ortalamaniz:"+ortalama);
		
		
		String gectimi=(ortalama>=60) ? "Gecti" : "Kaldi";
		System.out.println("Durumunuz:"+gectimi);


	}

}
