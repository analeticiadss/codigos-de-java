
class CarroMain {
	public static void main(String[] args) {
		Proprietario pr = new Proprietario("Elon Musk", 42424242, 1971);		
		
		/*Proprietario prop = new Proprietario();
		prop.nome = "A";
		prop.cnh = 23;
		prop.anoNascimento = 1999;*/
		
		Placa placa = new Placa("OAT", 2);
		
		Motor motor = new Motor(3, 45, 160);
		
		Carro carro = new Carro("DeLorean", "DMC-12", pr, placa, motor);
		
		System.out.println(carro.getDescricao());
	}
}
