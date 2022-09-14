package exercicio;

public class Preguica extends Animal{

	public Preguica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Preguica(String nome, int idade, String som, String acao) {
		super(nome, idade, som, acao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n------ Preguica -----\n \nSom emitido:" + EmiteSom() + "\nNome: " + getNome() + "\nIdade:" + getIdade()
				+ "\nA preguiça " + getAcao();
	}
	
	
}
