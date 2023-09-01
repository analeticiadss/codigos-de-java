package br.edu.ufam.icomp.lab_excecoes;
import java.util.*;

public class Caminho {
	private Coordenada[] caminho;
	private int tamanho;
	
	public Caminho(int maxTam) {
		this.caminho = new Coordenada[maxTam];
		tamanho = 0;
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {
		if(tamanho == this.caminho.length) {
			throw new TamanhoMaximoExcedidoException();
		} 
		else if(tamanho > 0) {
			if(this.caminho[tamanho-1].distancia(coordenada) > 15) {
				throw new DistanciaEntrePontosExcedidaException();
			}
		}
			this.caminho[tamanho] = coordenada;
			tamanho = tamanho+1;
	}
	
	public void reset() {
		for(int i = 0; i < caminho.length; i++) {
			caminho[i] = null;
			tamanho--;
		}
	}
	
	public String toString() {
		String desc = "Dados do caminho:\n" + " - Quantidade de pontos: " + tamanho
				+ " - Pontos:\n";
		if(tamanho > 0) {
			for(int i = 0; i < tamanho; i++) {
				desc = desc + "-> " + this.caminho[i].toString() + "\n";
			}
		}
		return desc;
	}
}
