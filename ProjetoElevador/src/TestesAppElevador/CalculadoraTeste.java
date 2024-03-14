package TestesAppElevador;

import FontesAppElevador.*;

import static org.junit.Assert.*;

import org.junit.Test;

//Testes unitários de funcionamento da Calculadora
public class CalculadoraTeste {

	Calculadora calc = new Calculadora();
	double resultCalc;
	
	//Teste de Getter e setter
	@Test
	public void testeLancarResultadoCalculadora() {
		calc.setResultado(10.2);
		assertEquals(calc.getResultado(), 10.2, 0.2);
	}
	
	@Test
	public void testeSomarPeso100com200kg() {
		resultCalc = calc.somar(100, 200);
		assertEquals(resultCalc, 300, 0);
	}
	
	@Test
	public void testeSubtrairPeso50de100kg() {
		resultCalc = calc.subtrair(100, 50);
		assertEquals(resultCalc, 50, 0);
	}

}
