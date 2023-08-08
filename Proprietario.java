
class Proprietario {
	String nome;
	int cnh;
	int anoNascimento;
	
	Proprietario(String nome, int cnh, int anoNascimento) {
		this.nome = nome;
		this.cnh = cnh;
		this.anoNascimento = anoNascimento;
	}
	
	Proprietario() {
	}
	
	int getIdade(int anoReferencia) {
		return (anoReferencia-anoNascimento);
		//return anoReferencia-anoNasc;
	}
	
	String getDescricao() {
		return ("Proprietario: nome=" + nome +
				", cnh=" + cnh + ", anoNascimento=" + anoNascimento + ".");
	}
	
}
