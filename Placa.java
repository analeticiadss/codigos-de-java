
class Placa {
	String placa;
	int tipo;
	
	Placa(String placa, int tipo) {
		this.placa = placa;
		this.tipo = tipo;
	}
	
	Placa() {
	}
	
	String getTipoString () {
		String tipoPlaca;
		
		switch(tipo) {
		case 1: tipoPlaca = "Normal";
		return tipoPlaca;
		case 2: tipoPlaca = "Servico";
		return tipoPlaca;
		case 3: tipoPlaca = "Oficial";
		return tipoPlaca;
		case 4: tipoPlaca = "Auto Escola";
		return tipoPlaca;
		case 5: tipoPlaca = "Prototipo";
		return tipoPlaca;
		case 6: tipoPlaca = "Colecionador";
		return tipoPlaca;
		default: tipoPlaca = "Outros";
		return tipoPlaca;
		}
	}
	
	boolean temEstacionamentoLivre() {
		
		if(tipo == 2 || tipo == 3) {
			return true;
		}
		else {
			return false;
		}
	}
	
	String getDescricao() {
		return ("Placa: placa=" + placa +
				", tipo=" + getTipoString() + ", estacionamentoLivre=" + temEstacionamentoLivre() + ".");
	}
}
