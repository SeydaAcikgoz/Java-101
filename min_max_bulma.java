import java.util.Scanner;

public class min_max_bulma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kac tane sayi gireceksiniz: :");
        int piece = input.nextInt();
        
        int max=-1000,min=1000;
        for(int i=0;i<piece;i++) {
        	System.out.print((i+1)+".sayiyi Giriniz :");
            int number = input.nextInt();
            
            if(number>max) {
            	max=number;
            }
            
            if(number<min) {
            	min=number;
            }
        }
        
        System.out.println("En buyuk sayi:"+max);
        System.out.println("En kucuk sayi:"+min);

	}

}
