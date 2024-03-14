package TestesAppElevador;

import FontesAppElevador.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//Testes da Classe de Controle de Embarque e Desembarque (teste integrado das Classes do projeto)
public class ControleEmbarqueTeste {


	ControleEmbarque controleEmbarque = new ControleEmbarque();
	Elevador elevadorX = new Elevador();
	Pessoa pessoa = new Pessoa();
	
@Before
	public void setupElevador() {
		elevadorX.setId(1);
		elevadorX.setCargaAtual(180);
		elevadorX.setCargaMaxima(200);
}


@Test
	public void testeEmbarcarPessoa100Kg() {
		pessoa.setNome("Pedro");
		pessoa.setPeso(100);
		boolean resultado = controleEmbarque.embarcar(pessoa,elevadorX,1);//Parametro 1, indica entrada
		assertEquals(resultado, false); //A pessoa não embarcou
	}

@Test
	public void testeEmbarcarPessoa15Kg() {
		pessoa.setNome("Mario");
		pessoa.setPeso(15);
		boolean resultado = controleEmbarque.embarcar(pessoa, elevadorX,1);//Parametro 1, indica entrada
		assertEquals(resultado, true);//A pessoa embarcou
	}

@Test
public void testeEmbarcar15Mais30DepoisSair15() {

	//Uma primeira pessoa entra com sucesso
	pessoa.setNome("Mario");
	pessoa.setPeso(15);
	boolean resultado = controleEmbarque.embarcar(pessoa, elevadorX, 1);//Parametro 1, indica entrada
	
	//Uma segunda pessoa tenta entrar mas é bloqueda por excesso de peso
	pessoa.setNome("Pedro");
	pessoa.setPeso(100);
	resultado = controleEmbarque.embarcar(pessoa, elevadorX, 1);//Parametro 1, indica entrada
	assertEquals(resultado, false);//A pessoa não pode embarcar, por excesso de peso

}


}