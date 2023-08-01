import java.util.Scanner;

class ArteAscii {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		int cont;
		cont = numero;
		
		while (cont >= 1) {
			for(int i = cont; i >=1; i--) {
				System.out.print("*");
			}
			System.out.println();
			cont--;
		}
		cont = cont+1; // porque zerou
		
		while (cont <= numero) {
			for(int j = 1; j <= cont; j++) {
				System.out.print("*");
			}
			System.out.println();
			cont++;
		}
		
		scan.close();
	
	}
}