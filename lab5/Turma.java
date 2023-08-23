import java.util.ArrayList;

class Turma {
	String nome, professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios = new ArrayList<Integer>();
	
	Turma() {}
	
	Turma(String nome, String professor, int numAlunos, boolean acessivel) {
		this.nome = nome;
		this.professor = professor;
		this.numAlunos = numAlunos;
		this.acessivel = acessivel;
		//adiciona os horarios
		/*for(int i = 0; i < 35; i++) {
			horarios.add(i+1);
		}
		/*for(int i = 0; i < horarios.size(); i++) {
			System.out.println(horarios.get(i));
		}*/
	}
	
	void addHorario(int horario) {
		//adiciona horarios
		horarios.add(horario);
		//System.out.println(horarios);
	}
	
	String getHorariosString() {
		ArrayList<String> dias = new ArrayList<String>();
		ArrayList<Integer> horas = new ArrayList<Integer>();
		
		for(int i = 0; i < horarios.size(); i++) {
			if (horarios.get(i) >= 1 && horarios.get(i) <= 7) {
				dias.add("segunda");
			}	else if (horarios.get(i) >= 8 && horarios.get(i) <= 14) {
				dias.add("terça");
			} else if (horarios.get(i) >= 15 && horarios.get(i) <= 21) {
				dias.add("quarta");
			} else if (horarios.get(i) >= 22 && horarios.get(i) <= 28) {
				dias.add("quinta");
			} else if (horarios.get(i) >= 29 && horarios.get(i) <= 35) {
				dias.add("sexta");
			}
			//System.out.println(dias.get(0));
			
			if (horarios.get(i) == 1 || horarios.get(i) == 8
					|| horarios.get(i) == 15 || horarios.get(i) == 22
					|| horarios.get(i) == 29) {
				horas.add(8);
			} else if (horarios.get(i) == 2 || horarios.get(i) == 9
					|| horarios.get(i) == 16 || horarios.get(i) == 23
					|| horarios.get(i) == 30) {
				horas.add(10);
			} else if (horarios.get(i) == 3 || horarios.get(i) == 10
					|| horarios.get(i) == 17 || horarios.get(i) == 24
					|| horarios.get(i) == 31) {
				horas.add(12);
			} else if (horarios.get(i) == 4 || horarios.get(i) == 11
					|| horarios.get(i) == 18 || horarios.get(i) == 25
					|| horarios.get(i) == 32) {
				horas.add(14);
			} else if (horarios.get(i) == 5 || horarios.get(i) == 12
					|| horarios.get(i) == 19 || horarios.get(i) == 26
					|| horarios.get(i) == 33) {
				horas.add(16);
			} else if (horarios.get(i) == 6 || horarios.get(i) == 13
					|| horarios.get(i) == 20 || horarios.get(i) == 27
					|| horarios.get(i) == 34) {
				horas.add(18);
			} else if (horarios.get(i) == 7 || horarios.get(i) == 14
					|| horarios.get(i) == 21 || horarios.get(i) == 28
					|| horarios.get(i) == 35) {
				horas.add(20);
			}
		}
		//System.out.println(dias);
		//System.out.println(horas);
		
		int tam = dias.size();
		String diasHoras = "";
		
		for(int j = 0; j < tam; j++) {
			diasHoras = diasHoras + dias.get(j) + " " + horas.get(j) + "hs";
				if(j != dias.size()-1) {
					diasHoras = diasHoras + ", ";
				} else {
					diasHoras = diasHoras + "";
				}
		}
		return diasHoras;
	}
	
	String getDescricao() {
		String ehAcessivel = "";
		if(acessivel == true) {
			ehAcessivel = "sim";
		} else {
			ehAcessivel = "não";
		}
		
		return ("Turma: " + nome + "\n" +
				"Professor: " + professor + "\n" +
				"Número de Alunos: " + numAlunos + "\n" +
				"Horário: " + getHorariosString() + "\n" +
				"Acessível: " + ehAcessivel + "\n");
	}
}
