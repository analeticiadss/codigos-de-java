import java.util.Scanner;

class AproximacaoPi {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double aproximacoes = scan.nextDouble();
		double primTermo = 3.000000, div = 0;
		double termos;
		double aprox = 0;
		
		
		for(int i = 1; i <= aproximacoes; i++) {
			
			termos = 4/(div*(div+1)*(div+2));
			if(i == 1) {
				aprox = primTermo;
			} else if(i > 1) {
				if(i%2 == 0) {
					aprox += termos;
				}
				else {
					aprox -= termos;
				}
			}
			System.out.printf("%.6f\n", aprox);
			div += 2;
		}
		
		scan.close();
	}
}
