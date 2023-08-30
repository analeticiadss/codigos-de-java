package br.edu.ufam.icomp.lab_excecoes;
import java.util.*;


public class RoverException extends Exception {
	public RoverException() {
		this("Exceção geral do rover");
	}
	
	public RoverException(String mensagem) {
		super(mensagem);
	}
}
