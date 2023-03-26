import java.util.Scanner;

public class harmonik_sayi {
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double result=0.0;
		
        System.out.print("Sayi Giriniz :");
        int number = input.nextInt();
        
        for(int i=1;i<=number;i++) {
        	result+=(1.0/i);//sonucun double cıkmasi icin double olan 1.0 a boleriz
        }

        System.out.println(result);
	}
}
