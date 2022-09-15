package exercicio;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro ("Belinha", 12);
		Cavalo cavalo = new Cavalo("Pé de Pano", 7);
		Preguica preguica = new Preguica("Leopolda",5);
		
		System.out.println("\n" + cachorro.getNome() + "\n" +cachorro.getIdade()+"\n"+cachorro.emiteSom("")+"\n"+cachorro.acao(""));
		System.out.println("\n" + cavalo.getNome() + "\n" +cavalo.getIdade()+"\n"+cavalo.emiteSom("")+"\n"+cavalo.acao(""));
		System.out.println("\n" + preguica.getNome() + "\n" +preguica.getIdade()+"\n"+preguica.emiteSom("")+"\n"+preguica.acao(""));
		
	
		
		
		
	}

}
