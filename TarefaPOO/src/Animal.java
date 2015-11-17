
public class Animal implements Comparable<Animal>{

	private String nome;
	private String raca;
	private double peso;
	private Integer idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String toString()
	{
		return " Nome: " +nome + "\n Raça: " +raca + "\n Peso: " + peso + "\n Idade: " + idade;
	}
	
	public String fazerBarulho() {
		return "Barulho: ";
	}
	
	public int compareTo(Animal outroAnimal)
	{
		if(this.peso < outroAnimal.getPeso())
			return -1;
		if(this.peso > outroAnimal.getPeso())
			return 1;
		return 0;
	}
}