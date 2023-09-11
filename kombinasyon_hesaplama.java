package patika;

import java.util.Scanner;

public class kombinasyon_hesaplama {

	public static void main(String[] args) {
		// C(n,r) = n! / (r! * (n-r)!)
		Scanner input=new Scanner(System.in);
		
		System.out.print("C(n,r):");
		System.out.println("n'i giriniz:");
		int n=input.nextInt();
		System.out.println("r'i giriniz:");
		int r=input.nextInt();
		
		System.out.println("C("+n+","+r+"):"+(faktoriyel(n))/(faktoriyel(r)*(faktoriyel(n-r))));
	}

	public static int faktoriyel(int sayi) {
		int faktoriyel = 1;
		for (int i = 1; i <= sayi; i++) {
			faktoriyel*=i;
		}
		return faktoriyel;
	}
}
