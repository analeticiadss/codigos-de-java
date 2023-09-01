package br.edu.ufam.icomp.lab_excecoes;
import java.util.*;

public class RoverMain {
	public static void main(String[] args) {
		Caminho c1 = new Caminho(3);
		
		try {
			Coordenada r1 = new Coordenada(23, 55, 8);
			c1.addCoordenada(r1);
			Coordenada r2 = new Coordenada(27, 65, 2);
			c1.addCoordenada(r2);
		}
		catch (RoverCoordenadaException e){
			c1.reset();
			e.getMessage();
		}
		catch (RoverCaminhoException e){
			c1.reset();
			e.getMessage();
		}
		System.out.println(c1.toString());
	}
}
