import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bob");
		cachorro.setRaca("Labrador");
		cachorro.setPeso(15.0);
		cachorro.setIdade(3);
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.setNome("Nick");
		cachorro2.setRaca("Poodle");
		cachorro2.setPeso(10.0);
		cachorro2.setIdade(8);
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.setNome("Atila");
		cachorro3.setRaca("Pinscher");
		cachorro3.setPeso(3.0);
		cachorro3.setIdade(1);
		
		Cachorro cachorro4 = new Cachorro();
		cachorro4.setNome("Dunga");
		cachorro4.setRaca("Vira-Lata");
		cachorro4.setPeso(18.0);
		cachorro4.setIdade(13);
		
		Gato gato = new Gato();
		gato.setNome("Peludo");
		gato.setRaca("Persa");
		gato.setPeso(5.0);
		gato.setIdade(8);
		
		Gato gato2 = new Gato();
		gato2.setNome("Zeus");
		gato2.setRaca("Siamês");
		gato2.setPeso(2.0);
		gato2.setIdade(11);
		
		Gato gato3 = new Gato();
		gato3.setNome("Eradog");
		gato3.setRaca("Azul Mar");
		gato3.setPeso(4.0);
		gato3.setIdade(9);
		
		Gato gato4 = new Gato();
		gato4.setNome("Xorin");
		gato4.setRaca("Siberiano");
		gato4.setPeso(10.0);
		gato4.setIdade(19);
		
		ManadaSustenido manadaSustenido = new ManadaSustenido();
		manadaSustenido.adicionarAnimal(gato);
		manadaSustenido.adicionarAnimal(gato2);
		manadaSustenido.adicionarAnimal(gato3);
		manadaSustenido.adicionarAnimal(gato4);
		manadaSustenido.adicionarAnimal(cachorro);
		manadaSustenido.adicionarAnimal(cachorro2);
		manadaSustenido.adicionarAnimal(cachorro3);
		manadaSustenido.adicionarAnimal(cachorro4);
		
		ManadaVirgula manadaVirgula = new ManadaVirgula();
		manadaVirgula.adicionarAnimal(gato);
		manadaVirgula.adicionarAnimal(gato2);
		manadaVirgula.adicionarAnimal(gato3);
		manadaVirgula.adicionarAnimal(gato4);
		manadaVirgula.adicionarAnimal(cachorro);
		manadaVirgula.adicionarAnimal(cachorro2);
		manadaVirgula.adicionarAnimal(cachorro3);
		manadaVirgula.adicionarAnimal(cachorro4);
		
		Collections.sort(manadaSustenido.animais);
		System.out.println("Ordenação por Peso \n");
		for(Animal a : manadaSustenido.animais)
		{
			System.out.println(a+"\n");
		}
		
		CompararNomes nomes = new CompararNomes();
		Collections.sort(manadaSustenido.animais,nomes);
		
		System.out.println("----------------------------------------------------------------- \n");
		System.out.println("Ordenação por Nomes \n");
		for(Animal a: manadaSustenido.animais)
		{
			System.out.println(a+"\n");
		}
		
		
		System.out.println(manadaSustenido.estourar());
		System.out.println(manadaVirgula.estourar());
		
	}

}
