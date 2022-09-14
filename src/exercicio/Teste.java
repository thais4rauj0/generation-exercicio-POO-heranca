package exercicio;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro ();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.setNome("Belinha");
		cachorro.setIdade(5);
		cachorro.setSom("Au au au");
		cachorro.setAcao("Deve Correr");
		
		cavalo.setNome("Pé de Pano");
		cavalo.setIdade(12);
		cavalo.setSom("Iiih");
		cavalo.setAcao("Deve Correr");
		
		preguica.setNome("Leila");
		preguica.setIdade(7);
		preguica.setSom("Aaah Ahhh");
		preguica.setAcao("Deve subir em árvores");
		
		System.out.println(cachorro.toString());
		System.out.println(cavalo.toString());
		System.out.println(preguica.toString());
		
	}

}
