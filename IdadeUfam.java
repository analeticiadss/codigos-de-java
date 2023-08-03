import java.util.Scanner;

class IdadeUfam {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); //tem o teclado como entrada

        int anoAtual = scan.nextInt();

        int idadeUfam = anoAtual - 1909;

        System.out.println("A UFAM tem " + idadeUfam + " anos de fundacao");

        scan.close();
    }
}