import java.util.Scanner;

public class manav_kasa_programı {
	public static void main(String[] args) {
		double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5,kilo,tutar=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Armut kac kilo?");
		kilo=input.nextDouble();
		tutar+=kilo*armut;
		
		System.out.print("Elma kac kilo?");
		kilo=input.nextDouble();
		tutar+=kilo*elma;
		
		System.out.print("Domates kac kilo?");
		kilo=input.nextDouble();
		tutar+=kilo*domates;
		
		System.out.print("Muz kac kilo?");
		kilo=input.nextDouble();
		tutar+=kilo*muz;
		
		System.out.print("Patlican kac kilo?");
		kilo=input.nextDouble();
		tutar+=kilo*patlican;
		
		System.out.print("Toplam tutar:"+tutar);
		
	}
}
