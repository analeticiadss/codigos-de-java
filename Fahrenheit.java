import java.util.Scanner;

class Fahrenheit {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double celsius = scan.nextInt();
		
		double fahrenheit = ((9*celsius)/5) + 32;
		
		System.out.printf("%.1f\n", fahrenheit);
		
		scan.close();
	}
}
