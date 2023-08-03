import java.util.Scanner;

class ContaEnergia {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int consumo = scan.nextInt();
		
		char instalacao = scan.next().charAt(0);
		
		float conta = 1;;
		
		if(consumo > 0 && consumo <= 500) {
			if (instalacao == 'R') {
				conta = consumo * 0.40f;
			} else if (instalacao == 'C') {
				conta = consumo * 0.55f;
			} else if (instalacao == 'I') {
				conta = consumo * 0.55f;
			} else {
				conta = -1.00f;
			}
		} else if (consumo > 500 && consumo <= 1000) {
			if (instalacao == 'R') {
				conta = consumo * 0.65f;
			} else if (instalacao == 'C') {
				conta = consumo * 0.55f;
			} else if (instalacao == 'I') {
				conta = consumo * 0.55f;
			} else {
				conta = -1.00f;
			}
		} else if (consumo > 1000 && consumo <= 5000) {
			if (instalacao == 'R') {
				conta = consumo * 0.65f;
			} else if (instalacao == 'C') {
				conta = consumo * 0.60f;
			} else if (instalacao == 'I') {
				conta = consumo * 0.55f;
			} else {
				conta = -1.00f;
			}
		} else if (consumo > 5000) {
			if (instalacao == 'R') {
				conta = consumo * 0.65f;
			} else if (instalacao == 'C') {
				conta = consumo * 0.60f;
			} else if (instalacao == 'I') {
				conta = consumo * 0.60f;
			} else {
				conta = -1.00f;
			}
		} else {
			conta = -1.00f;
		}
		
		System.out.printf("%.2f\n", conta);
		scan.close();
	}
}
