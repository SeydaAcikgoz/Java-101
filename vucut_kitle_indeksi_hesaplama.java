import java.util.Scanner;

public class vucut_kitle_indeksi_hesaplama {

	public static void main(String[] args) {
		//Formul: Kilo (kg) / Boy(m) * Boy(m)
		
		double sonuc,kilo,boy;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Boyunuzu giriniz(metre cinsinden):");
		boy=input.nextDouble();
		
		System.out.print("Kilonuzu giriniz:");
		kilo=input.nextDouble();
		
		sonuc=kilo/(boy*boy);
		
		System.out.print("Vucut kitle indeksiniz:"+sonuc);
		
	}

}
