package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

public class GISMain{
	public static void main (String[] args) {
		/*Celular c[] = new Celular[1];
		
		for(int i = 0; i < 1; i++) {
			c[i] = new Celular(55, 92, 930154926) ;
		}
		CarroLuxuoso carro[] = new CarroLuxuoso[1];
		for(int i = 0; i < 1; i++) {
			carro[i] = new CarroLuxuoso("LET-1122") ;
		}
		
		for(int i = 0; i < 1; i++) {
			System.out.println(c.getCodArea());
		}*/
		
		Localizavel vetorLocalizaveis[] = new Localizavel[2];
		
		vetorLocalizaveis[0] = new Celular(55, 92, 930154926);
		vetorLocalizaveis[1] = new CarroLuxuoso("LET-1122");
		
		for(int i = 0; i < 2; i++) {
			System.out.println(vetorLocalizaveis[i].getPosicao());
		}
		
	}
}
