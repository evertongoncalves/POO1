
public class ManadaSustenido extends Manada{
	
	public String estourar() {
		String som = "";
		for (Animal a: animais)
			som += a.fazerBarulho()+"#";
		return som;
	}
}
