import java.util.Scanner;

class NumeroNarcisista {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int cont = 0, soma = 0, numInicial;
		numInicial = num;
		
		while(num != 0) {
			num = num/10;
			cont++;
		}
		
		int digito = numInicial;
		
		while (digito != 0) {
			int resto = digito%10; //resto do num
			digito = digito/10; //parte inteira do digito
			soma += (Math.pow(resto, cont));
		}
		
		if(soma == numInicial) {
			System.out.print("SIM\n");
		}
		else {
			System.out.print("NAO\n");
		}
		
		scan.close();
	}
}
