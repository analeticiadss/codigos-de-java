import java.util.Scanner;

class AreaTriangulo {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a+b > c) {
			int s = (a+b+c)/2;
		
			double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
			System.out.printf("%.2f\n", area);
		}
		else {
			System.out.printf("Triangulo invalido\n");
		}
		
		scan.close();
	}
}
