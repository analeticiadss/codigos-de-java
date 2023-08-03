import java.util.Scanner;

class Xadrez {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        int qtdLinhas = scan.nextInt();

        int cont = 1;

        while (cont <= qtdLinhas) {
            for (int i = 1; i <= qtdLinhas; i++) {
                System.out.print("* ");
            }
            System.out.println("");
            cont++;
            if(cont%2 == 0) { // se for linha par
                System.out.print(" ");
            }
        }

        scan.close();
    }
}