import java.util.Scanner;

class AnimaisCedulas {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int valor = scan.nextInt();
		
		if(valor == 2) {
			System.out.println("Tartaruga");
		} else if(valor == 5) {
			System.out.println("Gar�a");
		} else if(valor == 10) {
			System.out.println("Arara");
		} else if(valor == 20) {
			System.out.println("Mico-le�o-dourado");
		} else if(valor == 50) {
			System.out.println("On�a-pintada");
		} else if(valor == 100) {
			System.out.println("Garoupa");
		} else {
			System.out.println("erro");
		}
		
		scan.close();
	}
}
