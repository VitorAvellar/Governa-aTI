import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {

	@Test
	public void testeSomar2com3() {
		
		calculos calc = new calculos();
		int resultado = calc.somar(2, 3);
		assertEquals(resultado, 5);
	}
		
	@Test
	public void testeSutrair2de3() {
		
		calculos calc = new calculos();
		int resultado = calc.subtrair(3,2);
		assertEquals(resultado, 1);
	}
	
	@Test
	public void testeDivisao5por() {
		
		calculos calc = new calculos();
		int resultado = calc.subtrair(3,2);
		assertEquals(resultado, 1);
	}
}
