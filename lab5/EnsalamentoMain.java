
class EnsalamentoMain {
	public static void main(String[] args) {
		Turma turma1 = new Turma("PP", "Horacio", 35, true);
		Turma turma2 = new Turma("AED1", "Edleno", 60, false);
		
		turma1.addHorario(10);
		turma1.addHorario(24);
		
		turma2.addHorario(1);
		turma2.addHorario(15);
		turma2.addHorario(29);
		
		System.out.println(turma1.getDescricao());
		System.out.println(turma2.getDescricao());
	}
}
