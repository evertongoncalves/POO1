import java.util.List;
import java.util.ArrayList;

public abstract class Manada {
	
	public List<Animal> animais = new ArrayList<Animal>();
	
	public void adicionarAnimal (Animal animal){
		animais.add(animal);
	}
	
	public String estourarManada(){
		String som = "";
		for (Animal a: animais)
			som.concat(a.fazerBarulho());
		return som;
	}
}
