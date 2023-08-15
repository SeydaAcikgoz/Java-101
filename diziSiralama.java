package patika;

import java.util.Scanner;

public class diziSiralama {
	 public static void main(String[] args) {
	        
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Dizinin boyutunu giriniz: ");
	        int boyut=scan.nextInt();
	        
	        int gecici;
	        int [] dizi = new int[boyut];
	        
	        for(int i = 0; i < boyut; i++)
	        {
	            System.out.print((i+1) + ".eleman: ");
	            dizi[i] = scan.nextInt();
	        }
	        System.out.println("Dizinin kucukten buyuge dogru sıralanmıs hali:\n");
	        for(int i = 0; i < boyut-1; i++)
	        {
	            for(int j = i+1; j < boyut; j++)
	            {
	                if(dizi[j] < dizi[i]) {
	                    gecici = dizi[i];
	                    dizi[i] = dizi[j];
	                    dizi[j] = gecici;
	                }
	            }
	        }
	        for(int i = 0; i < boyut; i++)
	        {
	            System.out.println("Dizinin " + (i+1) + ". elemanını : " + dizi[i]);
	        }
	    }
}
