import java.util.Scanner;

public class yildizlarla_ters_ucgen_yapimi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Yukseklik kac satir olsun?");
		int yukseklik = input.nextInt();
		
		for (int i = yukseklik ; i > 0; i--) {
			for (int j = 1; j <= yukseklik - i; j++) {
				System.out.print(" ");
			}
				

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
