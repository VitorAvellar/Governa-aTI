package FontesAppElevador;

//Classe de entidade - Calculadora aritmética de apoio para estimar a carga do elevador
public class Calculadora {

	//Atributo de resultado de cálculo
	double resultado;
	
	//Getters & Setters
	public void setResultado(double valor) {
		this.resultado = valor;
	}
	
	public double getResultado() {
		return this.resultado;
	}
	
	//Método de soma de dois fatores
	public double somar(double valor1, double valor2) {
		this.resultado = valor1 + valor2;
		return this.resultado;
	}
	
	//Método de subtração de dois fatores
	public double subtrair(double valor1, double valor2) {
		this.resultado = valor1 - valor2;
		return this.resultado;
	}

}
