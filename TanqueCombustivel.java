import java.util.Scanner;

public class TanqueCombustivel {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double raio = scan.nextDouble();
		double alturaAr = scan.nextDouble();
		int desejaCalcularV = scan.nextInt();
		
		double pi = Math.PI;
		double volumeAr = pi*alturaAr*alturaAr*(3*raio - alturaAr)/3.0;
		double volumeTotal = 4.0/3*pi*raio*raio*raio;
		double volumeCombustivel = volumeTotal - volumeAr;
		
		if(desejaCalcularV == 1) {
			//calcula volume de ar
			System.out.printf("%.4f\n", volumeAr);
		} else if (desejaCalcularV == 2) {
			//calcula volume de combustivel no tanque
			System.out.printf("%.4f\n", volumeCombustivel);
		}
		
		scan.close();	
	}
}
