package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

public class Celular implements Localizavel {
	private int codPais, codArea, numero;
	
	public Celular(int codPais, int codArea, int numero) {
		setCodPais(codPais);
		setCodArea(codArea);
		setNumero(numero);
	}
	
	public final void setCodPais(int codPais) {
		if(codPais >= 1 && codPais <= 1999) {
			this.codPais = codPais;
		} else {
			this.codPais = -1;
		}
	}
	
	public int getCodPais() {
		return this.codPais;
	}
	
	public final void setCodArea (int codArea) {
		if(codArea >= 10 && codArea <= 99) {
			this.codArea = codArea;
		} else {
			this.codArea = -1;
		}
	}
	
	public int getCodArea() {
		return this.codArea;
	}
	
	public final void setNumero(int numero) {
		if(numero >= 10000000 && numero <= 999999999) {
			this.numero = numero;
		} else {
			this.numero = -1;
		}
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public Posicao getPosicao() {
		double latitude, longitude, altitude;
		double valorMaxLat, valorMinLat, valorMaxLong, valorMinLong, valorMaxAlt, valorMinAlt;
		
		valorMaxLat = -2.960000;
		valorMinLat = -3.160000;
		valorMaxLong = -59.820000;
		valorMinLong = -60.120000;
		valorMaxAlt = 100;
		valorMinAlt = 15;
		
		Random r = new Random();
		latitude = valorMinLat + (valorMaxLat - valorMinLat) * r.nextDouble();
		longitude = valorMinLong + (valorMaxLong - valorMinLong) * r.nextDouble();
		altitude = valorMinAlt + (valorMaxAlt - valorMinAlt) * r.nextDouble();		
		
		Posicao posicao = new Posicao(latitude, longitude, altitude);
		return posicao;
	}
	
	public double getErroLocalizacao() {
		return 50.0;
	}
	
}
