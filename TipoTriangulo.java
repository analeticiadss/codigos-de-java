import java.util.Scanner;

class TipoTriangulo {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double lado1 = scan.nextDouble();
		double lado2 = scan.nextDouble();
		double lado3 = scan.nextDouble();
		
		double difLados23 = Math.abs(lado2 - lado3);
		double adicaoLados23 = lado2+lado3;
		
		//pra ser triangulo { |b-c| < a < b+c } precisa ser verdade
		if((lado1 < 0 || lado2 < 0 || lado3 < 0) || (difLados23 >= lado1 || lado1 >= adicaoLados23)) {
			System.out.println("invalido");
		}
		else {
			if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("equilatero");
			}else if(lado1 == lado2 || lado3 == lado2 || lado1 == lado3) {
				System.out.println("isosceles");
			}else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("escaleno");
			}
		}
		
		scan.close();	
	}
}
