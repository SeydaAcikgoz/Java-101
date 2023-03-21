package patika;

import java.util.Scanner;

public class uslu_sayi_hesaplama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sonuc=1;
		System.out.print("Ussu alinacak sayi:");
		int n=input.nextInt();
		System.out.print("Us olacak sayi:");
		int r=input.nextInt();
		
		for(int i=0;i<r;i++) {
			sonuc*=n;
		}
		
		System.out.println("Sonuc:"+sonuc);

	}

}
