import java.util.Scanner;

class MediaColecoes {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double num = scan.nextDouble();
		double soma = 0, cont = 0, media;
		
		while (num != -1) {
			while(num != -1) {
				soma += num;
				cont++;
				num = scan.nextInt();
			}
			media = soma/cont;
			System.out.printf("%.2f\n", media);
			num = scan.nextInt();
			soma = 0;
			cont = 0;
		}
		
		scan.close();
	}
}
