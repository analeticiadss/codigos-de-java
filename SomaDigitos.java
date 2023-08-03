import java.util.Scanner;

class SomaDigitos {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int soma = 0, resto;
		
		if(num < 10) {
			resto = num%10;
			System.out.printf("%d\n", resto);
		} else if (num >= 10) {
			while (num%10 != 0) {
				resto = num%10; //pega o primeiro numero da direita pra esquerda
				soma += resto;
				num = num/10; //parte inteira da div
			}
		}
		System.out.printf("%d\n", soma);
		
		scan.close();
	}
}