import java.util.Scanner;

class RotaOrtodromica {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
	
		double lat1 = scan.nextDouble();
		double long1 = scan.nextDouble();
		double lat2 = scan.nextDouble();
		double long2 = scan.nextDouble();
		
		double lat1Radianos = Math.toRadians(lat1);
		double long1Radianos = Math.toRadians(long1);
		double lat2Radianos = Math.toRadians(lat2);
		double long2Radianos = Math.toRadians(long2);
		
		double raioTerra = 6371;
		
		double senoLat1 = Math.sin(lat1Radianos);
		double senoLat2 = Math.sin(lat2Radianos);
		double cosLat1 = Math.cos(lat1Radianos);
		double cosLat2 = Math.cos(lat2Radianos);
		double cosLong = Math.cos(long1Radianos - long2Radianos);
		
		double distancia = raioTerra*Math.acos((senoLat1*senoLat2 + cosLat1*cosLat2*cosLong));
		
		System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %6f) e de %.2f km", lat1, long1, lat2, long2, distancia);
	
		scan.close();
	}
}
