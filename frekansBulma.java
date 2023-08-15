package patika;
import java.util.ArrayList;
import java.util.Scanner;

public class frekansBulma {
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
		int sayac = 0;

		for (int i = 0; i < dizi.length; i++) {
			sayac = 1;
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i] == dizi[j]) {
					sayac++;
					dizi[j]=-1;
				}
			}
			if (dizi[i] != -1) {
				System.out.println(dizi[i]+" den "+sayac+" adet vardir.");
			}
		}

	}
}
