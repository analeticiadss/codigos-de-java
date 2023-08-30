class Posicao {
	private double latitude, longitude, altitude;
	
	Posicao (double latitude, double longitude, double altitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
	}
	
	void setLatitude (double latitude) {
		if(latitude > 0) {
			this.latitude = latitude;
		}
		else {
			this.latitude = 0;
		}
	}
	
	double getLatitude() {
		return this.latitude;
	}
	
	void setLongitude(double longitude) {
		if(longitude > 0) {
			this.longitude = longitude;
		}
		else {
			this.longitude = 0;
		}
	}
	
	double getLongitude() {
		return this.longitude;
	}
	
	void setAltitude(double altitude) {
		if(altitude > 0) {
			this.altitude = altitude;
		}
		else {
			this.altitude = 0;
		}
	}
	
	double getAltitude() {
		return this.altitude;
	}
	
	String toString() {
		return ("Posição: " + latitude + ", "
		+ longitude + ", " + altitude + "\n");
	}
}