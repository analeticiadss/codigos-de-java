import java.util.ArrayList;

class Ensalamento {
	ArrayList<Sala> salas = new ArrayList<Sala>();
	ArrayList<Turma> turmas = new ArrayList<Turma>();
	ArrayList<TurmaEmSala> ensalamento = new ArrayList<TurmaEmSala>();
	
	Ensalamento() {}
	
	void addSala(Sala salas) {
		this.salas.add(salas);
	}
	
	void addTurma(Turma turmas) {
		this.turmas.add(turmas);
	}
	
	Sala getSala(Turma turmas) {
		for (int i = 0; i < ensalamento.size(); i++) {
			if(turmas == ensalamento.get(i).turma) {
				return ensalamento.get(i).sala;
			}
		}
		return null;
	}
	
	boolean salaDisponivel (Sala salas, int horario) {
		for (int i = 0; i < ensalamento.size(); i++) {
			if(salas == ensalamento.get(i).sala) {
				if(ensalamento.get(i).turma.horarios.get(i) == horario) {
					return false;
				}
			}
		}
		return true;
	}
	
	boolean salaDisponivel (Sala salas, ArrayList<Integer> horarios) {
		for(int i = 0; i < horarios.size(); i++) {
			if(salaDisponivel(salas, horarios.get(i)) == false) {
				return false;
			}
		}
		return true;
	}
	
	boolean alocar (Turma turmas, Sala salas) {
		for(int i = 0; i < turmas.horarios.size(); i++) {
			//precisa estar disponível em todos os horarios da turma
			if(salaDisponivel(salas, turmas.horarios.get(i)) == false) {
				return false;
			}
		}
		if(turmas.acessivel == salas.acessivel) {
			if(turmas.numAlunos <= salas.capacidade) {
				ensalamento.add(new TurmaEmSala(turmas, salas));
			}
		}
		else {
			return false;
		}
		return true;
	}
	
	int cont = 0, total = 0;
	void alocarTodas() {
		for(int i = 0; i < salas.size(); i++) {
			if (alocar(turmas.get(i), salas.get(i)) == true) {
				cont++;
				total = total + salas.get(i).capacidade - turmas.get(i).numAlunos;
			}
		}
	}
	
	int getTotalTurmasAlocadas() {
		return cont;
	}
	
	int getTotalEspacoLivre() {
		return total;
	}
	
	String relatorioResumoEnsalamento() {
		return ( "Total de Salas: " + salas.size() + "\n"
				+ "Total de Turmas: " + turmas.size() + "\n"
				+ "Turmas Alocadas: " + getTotalTurmasAlocadas() + "\n"
				+ "Espaços Livres: " + getTotalEspacoLivre() + "\n");
	}
	
	String relatorioTurmasPorSala() {
		String descricao = relatorioResumoEnsalamento() + "\n";
		
		for (int i = 0; i < salas.size(); i++) {
			descricao = descricao + "--- " + salas.get(i).getDescricao() + " ---\n\n";
			
			for(int j = 0; j < turmas.size(); j++) {
				if(ensalamento.get(i).sala == salas.get(i)) {
					descricao = descricao + ensalamento.get(i).turma.getDescricao() + "\n";
				}
				else if(alocar(turmas.get(j), salas.get(i)) == true) {
					descricao = descricao + turmas.get(i).getDescricao() + "\n";
				}
				else {
					descricao = descricao + "\n";
				}
			}
		}
		return descricao;
	}
	
	String relatorioSalasPorTurma() {
		String descri = relatorioResumoEnsalamento() + "\n";
		
		for(int i = 0; i < turmas.size(); i++) {
			for(int j = 0; j < salas.size(); i++) {
				if(alocar(turmas.get(i), salas.get(j)) == true) {
					descri = descri + turmas.get(i).getDescricao() +
							"Sala: " + salas.get(j).getDescricao() + "\n";
				}
				else {
					descri = descri + turmas.get(i).getDescricao() +
							"Sala: SEM SALA " + "\n";
				}
			}
		}
		return descri;
	}
}
