package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.*;

public class CarroLuxuoso extends Carro implements Localizavel {
	public CarroLuxuoso(String placa) {
		super(placa);
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
		return 15.0;
	}
}
