import java.util.Scanner;

public class AngryBirds {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double velocidade = scan.nextDouble();
		double angulo = scan.nextDouble();
		double distancia = scan.nextDouble();
		
		double anguloRad = Math.toRadians(angulo);
		double senoAnguloRad = Math.sin(2*anguloRad);
		//System.out.println("anguloRad = " + senoAnguloRad);
		
		double gravidade = 9.8;
		
		double alcanceMax = Math.abs(velocidade*velocidade)*senoAnguloRad/gravidade;
		
		//System.out.println("alcanceMax = " + alcanceMax + " e distancia =  " + distancia);
		
		double dif = Math.abs(distancia - alcanceMax);
		
		if(dif >= 0 && dif <= 0.1) {
			System.out.println("1");
		}
		else {
			System.out.println(0);
		}
		
		scan.close();
	}
}
