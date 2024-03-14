package TestesAppElevador;

//Pacote que executa somente os testes unitários
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculadoraTeste.class, ElevadorTeste.class, PessoaTeste.class })
public class TestesUnitarios {

}
