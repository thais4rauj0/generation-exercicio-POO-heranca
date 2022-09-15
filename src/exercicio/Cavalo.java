package exercicio;

public class Cavalo extends Animal{

	public Cavalo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emiteSom(String somEmitido) {
		// TODO Auto-generated method stub
		String som = "\nPocotó Pocotó";
		return som;
	}

	@Override
	public String acao(String acao) {
		// TODO Auto-generated method stub
		String acaoAnimal = "O cavalo deve correr";
		return acaoAnimal;
	}
	
	
	
}
