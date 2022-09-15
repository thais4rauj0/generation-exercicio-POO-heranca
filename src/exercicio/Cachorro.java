package exercicio;

public class Cachorro extends Animal{

	public Cachorro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emiteSom(String somEmitido) {
		// TODO Auto-generated method stub
		
		String som = "Au au au";
		return som;
	}

	@Override
	public String acao(String acao) {
		// TODO Auto-generated method stub
		String acaoAnimal = "Deve correr";
		return acaoAnimal;
		
	}
	
	
}
