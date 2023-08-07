import java.util.Scanner;

class VolumeCombustivel {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double alturaTotal = scan.nextDouble();
		double nivelCombustivel = scan.nextDouble();
		double raioBojo = scan.nextDouble();
		
		double pi = Math.PI;
		double volumeEsfera = 4.0/3*pi*raioBojo*raioBojo*raioBojo;
		
		
		if(alturaTotal <=0 || nivelCombustivel < 0 || raioBojo <= 0) {
			System.out.println("-1.000");
		}
		
		scan.close();
	}
}
