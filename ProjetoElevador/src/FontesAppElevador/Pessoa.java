package FontesAppElevador;

//Classe de entidade - Pessoas que frequentam os elevadores
public class Pessoa {

	String nome;
	double peso;
	
	//Getters & Setters
	public void setNome(String valorNome) {
		this.nome = valorNome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setPeso(double valorPeso) {
		this.peso = valorPeso;
	}
	
	public double getPeso() {
		return this.peso;
	}

}
