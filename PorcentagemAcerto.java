import java.util.Scanner;

class PorcentagemAcerto {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
			
		int tamanho = 50;
		int vetorRespostas[] = new int[tamanho];
		int vetorGabarito[] = new int[tamanho];
			
		int r = 0, g = 0;
		float certo = 0, porcentagemAcerto;
		
		vetorRespostas[0] = scan.nextInt();
		if(vetorRespostas[0] != -1) {
			while (vetorRespostas[r] != -1) {
				r++;
				vetorRespostas[r] = scan.nextInt();
			}
		}

		//vetorGabarito[r+1] = -1;
		vetorGabarito[0] = scan.nextInt();
		if(vetorGabarito[0] != -1) {
			while (vetorGabarito[g] != -1) {
				g++;
				vetorGabarito[g] = scan.nextInt();
			}
		}
			
		for (int i = 0; i <= r-1; i++) {
			if(vetorRespostas[i] == vetorGabarito[i]){
				certo++;
			}
		}
		
		porcentagemAcerto = certo*100/r;
		System.out.printf("%.2f", porcentagemAcerto);
		
		scan.close();
	}
}