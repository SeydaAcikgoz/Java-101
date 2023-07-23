package patika;

import java.util.Scanner;

public class oruntu_ornek {
//Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
//Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan 
//sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

	static int number;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		oruntu(number, number, -1);

	}

	public static void oruntu(int constantNum, int variableNum, int sign) {
		if (variableNum > constantNum)
			return;
		if (variableNum < 1)
			sign *= -1;
		System.out.print(" " + variableNum + " ");
		oruntu(constantNum, variableNum + sign * 5, sign);
	}

}
