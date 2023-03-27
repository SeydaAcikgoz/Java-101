import java.util.Scanner;

public class ebob_ekok {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ebob=1,ekok=1;

		System.out.print("1.Sayiyi Giriniz :");
        int number1 = input.nextInt();
        
        System.out.print("2.Sayiyi Giriniz :");
        int number2 = input.nextInt();
        //sayilardan hangisi buyukse ona gore ebobo bulundu
        if(number1<number2) {
        	
        	int i=1;
        	while(i<=number1) {
        		if(number1%i==0 && number2%i==0) {
        			ebob=i;
        		}
        		i++;
        	}
        }else {
        	int i=1;
        	while(i<=number2) {
        		if(number1%i==0 && number2%i==0) {
        			ebob=i;
        		}
        		i++;
        	}
        }
        System.out.println(number1+" ve "+number2+" nin ebobu: "+ebob);
        
        int k=1;
        while(k<=number1*number2) {
        	if(k%number1==0 && k%number2==0) {
    			ekok=k;
    			break;
    		}
        	k++;
        }
        System.out.println(number1+" ve "+number2+" nin ekoku: "+ekok);

	}

}
