
public class PrimeNumber {

	public static void main(String[] args) {
		int num = 4;
		int dividers = 0;
		for(int i=1; i<=num; i++) {
			if (num%i == 0) {
				dividers++;
			}
		}
		if(dividers < 3) {
			System.out.println("The number is prime");
		}else {
			System.out.println("The number is composite");
		}
		

	}

}
