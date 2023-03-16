package patika;

import java.util.Scanner;

public class artik_yil_hesaplama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.print("Yil giriniz:");
		int year=input.nextInt();
		
		if(year %4==0) {
			System.out.print(year+" artik yildir.");
		}else {
			System.out.print(year+" artik yil degildir.");
		}
	}

}
