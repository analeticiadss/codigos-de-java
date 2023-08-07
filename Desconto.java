import java.util.Scanner;

class Desconto {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float precoSemDesconto = scan.nextFloat();
		
		float desconto = precoSemDesconto*5/100;
		float precoComDesconto;
		
		if(precoSemDesconto < 200f) {
			System.out.printf("%.2f\n", precoSemDesconto);
		}
		else {
			precoComDesconto = precoSemDesconto-desconto;
			System.out.printf("%.2f\n", precoComDesconto);
		}
		
		scan.close();
	}
}
