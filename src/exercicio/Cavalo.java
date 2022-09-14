package exercicio;

public class Cavalo extends Animal{

	public Cavalo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cavalo(String nome, int idade, String som, String acao) {
		super(nome, idade, som, acao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n----- Cavalo -----\nSom Emitido: " + EmiteSom() + "\nNome: " + getNome() + "\nIdade:" + getIdade()
				+ "\nO cavalo " + getAcao();
	}
	
	

}
