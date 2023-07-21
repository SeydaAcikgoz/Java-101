package patika;

import java.util.Scanner;

public class palindrom_sayi {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter number:");
		int number=input.nextInt();
		System.out.println(isPalindrom(number));
		
	}
	
	public static boolean isPalindrom(int number) {
		int temp=number,lastNumber=0,reverseNumber=0;
		
		while(temp!=0) {
			lastNumber=temp%10;
			reverseNumber=(reverseNumber*10)+lastNumber;
			temp/=10;
		}
		
		if(number==reverseNumber)
			return true;
		else
			return false;
	}

}
