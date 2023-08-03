import java.util.Scanner;

class FolhaPagamento {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valorH = scan.nextDouble();
		int qtdH = scan.nextInt();
		
		double salarioBruto = valorH*qtdH;
		double ir = salarioBruto*11/100;
		double inss = salarioBruto*8/100;
		double totalDescontos = ir+inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.printf("Salario bruto: R$%.2f\n", salarioBruto);
		System.out.printf("IR: R$%.2f\n", ir);
		System.out.printf("INSS: R$%.2f\n", inss);
		System.out.printf("Total de descontos: R$%.2f\n", totalDescontos);
		System.out.printf("Salario liquido: R$%.2f\n", salarioLiquido);
		
		scan.close();
	}
}
