import java.util.ArrayList;

class Turma {
	String disciplina;
	int ano;
	int semestre;
	Professor professor;
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	Turma (String disciplina, int ano, int semestre, Professor professor) {
		this.disciplina = disciplina;
		this.ano = ano;
		this.semestre = semestre;
		this.professor = professor;
	}
	
	void addAluno (Aluno aluno) {
		if(getAluno(aluno.matricula) == null) {
			alunos.add(aluno);
		}
	}
	
	public Aluno getAluno (int matricula) {
		for(int i = 0; i < this.alunos.size(); i++) {
			if(matricula == this.alunos.get(i).matricula) {
				return (this.alunos.get(i));
			}
		}
		return null;
	}
	
	double getMediaIdade() {
		double soma = 0, tam = alunos.size();
		for(int i = 0; i < tam; i++) {
			soma += alunos.get(i).getIdade();
		}
		return soma/tam;
	}
	
	String getDescricao() {
		String descricaoAluno = "";
		String descricaoTurma = "Turma " + disciplina + " - " + ano + "/" + semestre + " ";
		String descricaoProf = professor.getDescricao();
		
		for(int i = 0; i < this.alunos.size(); i++){
			descricaoAluno = descricaoAluno + "- Aluno " + (i+1) + ": " + this.alunos.get(i).getDescricao() + "\n";
			//System.out.println(descricaoAluno);
			//return descricaoAluno;
		}
		return (descricaoTurma + "(" + descricaoProf + "):" +  "\n" + descricaoAluno);
		
	}
}
