/*  Questão 1. Nesta questão foi utilizado o loop para estabelecer a sequência até o decimo quinto numero */

package questao_1;

public class SequenciaFibonacci {
	public static void main(String[] args) {
		int primeiroNumero = 1;
		int segundoNumero = 0;
		int aux;

		for (int i = 0; i < 15; i++) {
			System.out.println(primeiroNumero);
			aux = primeiroNumero;
			primeiroNumero = primeiroNumero + segundoNumero;
			segundoNumero = aux;
		}
	}
}
