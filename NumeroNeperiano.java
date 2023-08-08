import java.util.Scanner;

class NumeroNeperiano {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double aproximacoes = scan.nextDouble();
		double cont, fatorial;
		double termos = 0;
		
		
		for(int i = 0; i < aproximacoes; i++) {
			cont = i;
			fatorial = cont;
			
			if(cont == 1 || cont == 0) {
				fatorial = 1;
			} else {
				while(cont > 1) { //4
					fatorial = fatorial*(cont-1);
					cont--;
				}
			}
			
			termos += 1/fatorial;
		}
		System.out.printf("%.6f\n", termos);
		
		scan.close();
	}
}
