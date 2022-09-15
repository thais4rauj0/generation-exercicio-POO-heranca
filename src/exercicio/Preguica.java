package exercicio;

public class Preguica extends Animal{

	public Preguica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emiteSom(String somEmitido) {
		// TODO Auto-generated method stub
		String som = "Aaaaah Aaaah";
		return som;
	}

	@Override
	public String acao(String acao) {
		// TODO Auto-generated method stub
		
		String acaoAnimal = "Deve subir em árvores";
		return acaoAnimal;
	}
	
	
}
