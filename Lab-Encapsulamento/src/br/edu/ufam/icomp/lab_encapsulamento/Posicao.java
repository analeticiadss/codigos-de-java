package br.edu.ufam.icomp.lab_encapsulamento;

public class Posicao {
	private double latitude, longitude, altitude;
	
	public Posicao (double latitude, double longitude, double altitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
	}
	
	public void setLatitude (double latitude) {
		if(latitude >= -3.160000 && latitude <= -2.960000) {
			this.latitude = latitude;
		}
		else {
			this.latitude = -1;
		}
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLongitude(double longitude) {
		if(longitude >= -60.120000 && longitude <= -60.120000) {
			this.longitude = longitude;
		}
		else {
			this.longitude = -1;
		}
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setAltitude(double altitude) {
		if(altitude >= 15 && altitude <= 100) {
			this.altitude = altitude;
		}
		else {
			this.altitude = -1;
		}
	}
	
	public double getAltitude() {
		return altitude;
	}
	
	public String toString() {
		return "Posição: " + latitude + ", "
		+ longitude + ", " + altitude + "\n";
	}
}
