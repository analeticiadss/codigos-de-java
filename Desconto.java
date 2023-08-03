import java.util.Scanner;

class Desconto {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        float precoSemDesconto = scan.nextFloat();

        float desconto = precoSemDesconto*5/100;

        if(precoSemDesconto >= 200) {
            float precoComDesconto = precoSemDesconto - desconto;
            System.out.printf("%.2f\n", precoComDesconto);
        }
        else {
            System.out.printf("%.2f\n", precoSemDesconto);
        }


        scan.close();
    }
}