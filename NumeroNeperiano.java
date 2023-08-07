import java.util.Scanner;

class NumeroNeperiano {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double aproximacoes = scan.nextDouble();
		double div = 0, cont = 0, fatorial;
		double termos;
		double aprox = 0;
		
		while(cont != 0) {
			fatorial = 
		}
		
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
