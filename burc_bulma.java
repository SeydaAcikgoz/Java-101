package patika;

import java.util.Scanner;

public class burc_bulma {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Kacinci ayda dogdunuz:");
		int month=input.nextInt();
		
		System.out.print("Kacinci gunde dogdunuz:");
		int day=input.nextInt();
		
		if(month==1) {
			if(day>=1 && day<=31) {
				if(day<22) {
					System.out.println("Burcunuz : Oglak");
				}else {
					System.out.println("Burcunuz : Kova");
				}
			}else {
				System.out.println("Gecersiz gun girdiniz!");
			}
		}
		
		if(month==2) {
			if(day>=1 && day<=28) {
				if(day<20) {
					System.out.println("Burcunuz : Kova");
				}else {
					System.out.println("Burcunuz : Balik");
				}
			}else {
				System.out.println("Gecersiz gun girdiniz!");
			}
		}
		
		if(month==3) {
			if(day>=1 && day<=31) {
				if(day<21) {
					System.out.println("Burcunuz : Balik");
				}else {
					System.out.println("Burcunuz : Koc");
				}
			}else {
				System.out.println("Gecersiz gun girdiniz!");
			}
		}
		
		if(month==4) {
			if(day>=1 && day<=30) {
				if(day<21) {
					System.out.println("Burcunuz : Koc");
				}else {
					System.out.println("Burcunuz : Boga");
				}
			}else {
				System.out.println("Gecersiz gun girdiniz!");
			}
		}
		
		if(month==5) {
			if(day>=1 && day<=31) {
				if(day<22) {
					System.out.println("Burcunuz : Boga");
				}else {
					System.out.println("Burcunuz : Ikizler");
				}
			}else {
				System.out.println("Gecersiz gun girdiniz!");
			}
		}
		
		if(month==6) {
			if(day>=1 && day<=30) {
				if(day<23) {
					System.out.println("Burcunuz : Ikizler");
				}else {
					System.out.println("Burcunuz : Yengec");
				}
			}else {
				System.out.println("Gecersiz gun girdiniz!");
			}
		}
		if(month==7) {
			if(day>=1 && day<=31) {
				if(day<23) {
					System.out.println("Burcunuz : Yengec");
				}else {
					System.out.println("Burcunuz : Aslan");
				}
			}else {
				System.out.println("Gecersiz gun girdiniz!");
			}
		}
		if(month==8) {
			if(day>=1 && day<=31) {
				if(day<23) {
					System.out.println("Burcunuz : Aslan");
				}else {
					System.out.println("Burcunuz : Basak");
				}
			}else {
				System.out.println("Gecersiz gun girdiniz!");
			}
		}
		
		if(month==9) {
			if(day>=1 && day<=30) {
				if(day<23) {
					System.out.println("Burcunuz : Basak");
				}else {
					System.out.println("Burcunuz : Terazi");
				}
			}else {
				System.out.println("Gecersiz gun girdiniz!");
			}
		}
		
		if(month==10) {
			if(day>=1 && day<=31) {
				if(day<23) {
					System.out.println("Burcunuz : Terazi");
				}else {
					System.out.println("Burcunuz : Akrep");
				}
			}else {
				System.out.println("Gecersiz gun girdiniz!");
			}
		}
		
		if(month==11) {
			if(day>=1 && day<=30) {
				if(day<22) {
					System.out.println("Burcunuz : Akrep");
				}else {
					System.out.println("Burcunuz : Yay ");
				}
			}else {
				System.out.println("Gecersiz gun girdiniz!");
			}
		}
		
		if(month==12) {
			if(day>=1 && day<=31) {
				if(day<22) {
					System.out.println("Burcunuz : Yay ");
				}else {
					System.out.println("Burcunuz : Oglak");
				}
			}else {
				System.out.println("Gecersiz gun girdiniz!");
			}
		}
				

	}

}
