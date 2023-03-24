package patika;

import java.util.Scanner;

public class basamaklar_toplami_bulma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        int number = input.nextInt();
        int tempNumber=number;
        int total=0;
        
        while (tempNumber != 0) {
        	total+=tempNumber%10;
            tempNumber /= 10;
            
        }
        System.out.println(number+" sayisinin basamaklar toplami:"+total);
	}

}
