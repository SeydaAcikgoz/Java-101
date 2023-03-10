import java.util.Scanner;

public class etkinlik_onerme {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Hava sicakligini giriniz:");
		double heat = input.nextDouble();

		if (heat < 5) {
			System.out.println("Kayaga gidebilirsin.");
		} else if (heat >= 5 && heat < 15) {
			System.out.println("Sinemaya gidebilirsin.");
		}else if(heat>=15 && heat<25) {
			System.out.println("Piknige gidebilirsin.");
		}else if(heat>=25) {
			System.out.println("Yuzmeye gidebilirsin.");
		}

	}
