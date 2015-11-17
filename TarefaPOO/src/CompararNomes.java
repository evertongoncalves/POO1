import java.util.Comparator;

public class CompararNomes implements Comparator<Animal> 
{	
		public int compare(Animal animal, Animal outroAnimal)
		{
			return animal.getNome().compareTo(outroAnimal.getNome());
		}
}
