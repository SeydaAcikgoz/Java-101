import java.util.Scanner;

public class taksimetre_hesaplama {

	public static void main(String[] args) {

		int km;
		double perKm=2.20,total,startPrice=10;
		
		Scanner veri=new Scanner(System.in);
		System.out.print("Mesafe(km cinsinden):");
		km=veri.nextInt();
		
		total=startPrice+(km*perKm);
		
		total=(total<20) ? 20 : total; //Minimum ödenecek tutar 20 TL'dir. 20 TL altında 
		//ki ücretlerde yine 20 TL alınmıştır.
		System.out.println("Toplam tutar:"+total);
	}

}
