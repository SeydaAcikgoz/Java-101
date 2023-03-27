package patika;

import java.util.Scanner;

public class mukemmel_sayi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number = 0,total=0;
		
		do {
			total=0;
			System.out.print("Sayi Giriniz :");
			number = input.nextInt();
			
			for(int i=1;i<number;i++) {
				if(number%i==0) {
					total+=i;
				}
			}
			if(number==total) {
				System.out.println(number+" mukemmel sayidir.");
			}else {
				System.out.println(number+" mukemmel sayi degildir.");
			}
				
		}while(number>0);
	}

}
