package exercicio;

public abstract class Animal {
	
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public Animal() {
		super();
	}
	
	//Método emitir Som
	
	public abstract String emiteSom(String somEmitido);
	
	public abstract String acao(String acao);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	

}
	

