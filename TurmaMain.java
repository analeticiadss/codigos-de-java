
class TurmaMain {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Ana", 333, 1999);
		Aluno aluno2 = new Aluno("Leticia", 222, 1997);
		Aluno aluno3 = new Aluno("Rafael", 111, 1992);
		System.out.println(aluno2.getDescricao());
		
		Professor prof = new Professor("Ms.", "Leticia", 333);
		
		Turma turma = new Turma("projeto de programas", 2023, 2, prof);
		turma.addAluno(aluno);
		turma.addAluno(aluno2);
		turma.addAluno(aluno3);
		
		System.out.println(turma.getDescricao() + turma.getMediaIdade());
	}
}
