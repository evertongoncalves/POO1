
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro();
		cachorro.setRaca("Labrador");
		cachorro.setPeso(15.0);
		cachorro.setIdade(3);
		
		Gato gato = new Gato();
		gato.setRaca("Persa");
		gato.setPeso(5.0);
		gato.setIdade(8);
		
		ManadaSustenido manadaSustenido = new ManadaSustenido();
		manadaSustenido.adicionarAnimal(gato);
		manadaSustenido.adicionarAnimal(cachorro);
		
		ManadaVirgula manadaVirgula = new ManadaVirgula();
		manadaVirgula.adicionarAnimal(gato);
		manadaVirgula.adicionarAnimal(cachorro);
		
		System.out.println(manadaSustenido.estourar());
		System.out.println(manadaVirgula.estourar());
		
	}

}
