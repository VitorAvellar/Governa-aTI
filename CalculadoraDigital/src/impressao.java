import java.util.Scanner;

public class impressao {

	public static void main(String[] args) {

		calculos c = new calculos();
		
		Scanner teclado = new Scanner(System.in);
		String operacao;
		
		System.out.println("Escolha a operação");
		operacao = teclado.next();
		int n1, n2;
		
		System.out.println("numero 1");
		n1 = teclado.nextInt();
		
		System.out.println("numero 2");
		n2 = teclado.nextInt();
		
		if (operacao.equals("soma")) {
			int resultado = c.somar(n1, n2);
			System.out.println("resultado da soma: " + resultado);
		}
		else if (operacao.equals("subtrair")) {
			int resultado = c.subtrair(n1, n2);
			System.out.println("resultado da subtração: " + resultado);
		}else if (operacao.equals("multiplicacao")) {
			int resultado = c.multiplicar(n1, n2);
			System.out.println("Resultado da multiplicação: " + resultado);
		}else if (operacao.equals("dividir")) {
			int resultado = c.dividir(n1, n2);
			System.out.println("Resultado da divisão: " + resultado);

		}
		
		
	}

}
