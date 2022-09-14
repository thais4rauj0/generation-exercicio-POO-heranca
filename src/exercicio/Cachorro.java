package exercicio;

public class Cachorro extends Animal{

	public Cachorro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cachorro(String nome, int idade, String som, String acao) {
		super(nome, idade, som, acao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n----- Cachorro ------- \nSom Emitido: " + EmiteSom() + "\nNome: " + getNome() + "\nIdade:" + getIdade()
				+  "\nO cachorro " + getAcao();
	}
	
	
}
