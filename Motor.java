
class Motor {
	int tipo;
	double capacidade;
	int potencia;
	
	Motor() {
	}
	
	Motor(int tipo, double capacidade, int potencia) {
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.potencia = potencia;
	}
	
	String getTipoString() {
		String tipoMotor;
		
		switch(tipo) {
		case 1: tipoMotor = "Gasolina";
				return tipoMotor;
		
		case 2: tipoMotor = "Alcool";
				return tipoMotor;
				
		case 3: tipoMotor = "Flex";
				return tipoMotor;
				
		case 4: tipoMotor = "Diesel";
				return tipoMotor;
				
		case 5: tipoMotor = "Eletrico";
				return tipoMotor;
				
		default: tipoMotor = "Outros";
				return tipoMotor;
		}
	}
	
	String getDescricao() {
		return ("Motor: tipo=" + getTipoString() +
				", capacidade=" + capacidade +
				"L, potencia=" + potencia + "CV.");
	}
}
