package FontesAppElevador;

//Classe de entidade - Elevador de edifício
public class Elevador {
	
	int id;
	double cargaMaxima;
	double cargaAtual;
	boolean sinalAlerta;
	
	//Getters & Setters
	public void setId(int valor) {
		this.id = valor;
	}
	
	public double getId() {
		return this.id;
	}
	
	public void setCargaMaxima(double valor) {
		this.cargaMaxima = valor;
	}
	
	public double getCargaMaxima() {
		return this.cargaMaxima;
	}
	
	public void setCargaAtual(double valor) {
		this.cargaAtual = valor;
	}
	
	public double getCargaAtual() {
		return this.cargaAtual;
	}
	
	public void setSinalAlerta(boolean valor) {
		this.sinalAlerta = valor;
	}
	
	public boolean getSinalAlerta() {
		return this.sinalAlerta;
	}
	
	//Adiciona o peso de uma pessoa ao elevador
	public double entrarNoelevador(double peso) {
		Calculadora calc = new Calculadora();
		this.cargaAtual = calc.somar(this.cargaAtual, peso);
		return this.cargaAtual;
	}
	
	//Retira o peso de uma pessoa ao elevador
	public double sairDoelevador(double peso) {
		Calculadora calc = new Calculadora();	
		this.cargaAtual = calc.subtrair(this.cargaAtual, peso);
		return cargaAtual;
	}
	
	//Alerta excesso de peso
	public boolean avaliarpeso() {
		if(this.cargaAtual > this.cargaMaxima) {
			return sinalAlerta = true;
		}
		else {
			return sinalAlerta = false;
		}
	}

}

