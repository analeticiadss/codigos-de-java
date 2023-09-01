package br.edu.ufam.icomp.lab_excecoes;
import java.util.*;

public class Coordenada {
	private int posX, posY, digito;
	
	public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException {
		
		if(posX < 0 || posY < 0) {
			throw new CoordenadaNegativaException();
		}
		else if(posX > 3001 || posY > 3001) {
			throw new CoordenadaForaDosLimitesException();
		} else if((posX + posY)%10 != digito) {
			throw new DigitoInvalidoException();
		}
		else {
			this.posX = posX;
			this.posY = posY;
			this.digito = digito;
		}
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	public double distancia(Coordenada coordenada) {
		
		return Math.sqrt(Math.pow(getPosX()-coordenada.posX, 2)+Math.pow(getPosY() - coordenada.posY, 2));
		
	}
	
	public String toString() {
		return(posX + ", " + posY + "\n");
	}
}
