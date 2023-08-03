import java.util.Scanner;

class ParImpar {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		while(num != -1) {
			if(num%2 == 0) {
				System.out.print("PAR\n");
			}else {
				System.out.print("IMPAR\n");
			}
			num = scan.nextInt();
		}
		
		scan.close();
	}
}
