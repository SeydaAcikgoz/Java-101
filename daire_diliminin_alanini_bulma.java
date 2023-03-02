import java.util.Scanner;

public class daire_diliminin_alanini_bulma {

	public static void main(String[] args) {
		// Formül : (𝜋 * (r*r) * 𝛼) / 360
		
		Scanner veri=new Scanner(System.in);

		double pi=3.14;
		
		System.out.print("Dairenin yaricapini giriniz:");
		int r=veri.nextInt();
		
		System.out.print("Dairenin merlez acisinin olcusunu giriniz:");
		int aci=veri.nextInt();
		
		double alan=(pi*(r*r)*aci)/360;
		
		System.out.print("Alan:"+alan);
	}

}
