package patika;

import java.util.Scanner;

public class us_alma {
	static int result=1;
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Ussu alinacak sayi:");
		int n=input.nextInt();
		System.out.print("Us olacak sayi:");
		int r=input.nextInt();
		
		
		System.out.println("Sonuc:"+us(n,r));

	}
	
	public static int us(int n,int r) {
		if(r==0) {
			return 1;
		}
		
		return n*us(n,r-1);
	}
}
