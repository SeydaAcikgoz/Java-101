package patika;

public class asal_sayilar {

	public static void main(String[] args) {

		int sayac=0;
		//1-100 arası asal sayılar
		for(int i=1;i<=100;i++) {
			sayac=0;
			for(int j = 2; j < i; j++)
	        {
	            if(i % j == 0) {
	                sayac++;
	            }
	        }
	        if(sayac == 0 && i!=1) {//1 asal sayı olmadıgı icin cikarttik
	            System.out.print(i+"\t");
	        }
	        
		}

	}

}
