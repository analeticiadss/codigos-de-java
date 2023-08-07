import java.util.Scanner;

class SomaColecoes {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int soma = 0;
		
		while (num != -1) {
			while(num != -1) {
				soma += num;
				num = scan.nextInt();
			}
			System.out.println(soma);
			num = scan.nextInt();
			soma = 0;
		}
		
		scan.close();
	}
}
