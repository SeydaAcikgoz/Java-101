public class fibonacci_serisi {
	public static void main(String args[]) {
		int sayi = 11;

		int n1 = 0, n2 = 1, n3;
		//System.out.println(n1 + "+" + n2+"="+(n1+n2));

		for (int i = 2; i < sayi; ++i) {
			n3 = n1 + n2;
			System.out.println(n1+"+"+n2+"=" + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	
}
